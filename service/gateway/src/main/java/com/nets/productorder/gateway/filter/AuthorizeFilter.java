package com.nets.productorder.gateway.filter;

import com.alibaba.fastjson.JSONObject;
import nets.unionnets.java_lib.util.Func.netsCode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpCookie;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpRequestDecorator;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.util.UriComponentsBuilder;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import nets.unionnets.java_lib.util.Func.JWTUtils;

//实现用户权限校验
@Component
public class AuthorizeFilter implements GlobalFilter, Ordered {

    //令牌头名字（可能存在头文件里，或cookie里，或请求体里	）
    private static final String AUTHORIZE_TOKEN = "token";

    @Value("${server.tokenkey}")
    public String sTokenKey;

    netsCode sCode=netsCode.getInstance();

    /***
     * 全局过滤器
     * @param exchange
     * @param chain
     * @return
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        //获取Request、Response对象
        ServerHttpRequest request = exchange.getRequest();
        ServerHttpResponse response = exchange.getResponse();

        //获取请求的URI
        String path = request.getURI().getPath();

        System.out.println("request:"+path);

        //不进行权限验证的接口
        if (path.startsWith("/heath/") ||
                path.startsWith("/userinfo/userinfo/login") ||
                path.startsWith("/userinfo/userinfo/init") ||
                path.startsWith("/api/brand/search/")
        ) {
            //放行
            Mono<Void> filter = chain.filter(exchange);
            return filter;
        }

        //获取头文件中的令牌信息
        String tokent = request.getHeaders().getFirst(AUTHORIZE_TOKEN);

        //如果头文件中没有令牌信息，则从请求参数中获取
        if (StringUtils.isEmpty(tokent)) {
            tokent = request.getQueryParams().getFirst(AUTHORIZE_TOKEN);
        }
        //如果请求参数中没有令牌信息，则从cookie中获取
        if (StringUtils.isEmpty(tokent)) {
            HttpCookie httpCookie = request.getCookies().getFirst(AUTHORIZE_TOKEN);
            if (httpCookie != null) {
                tokent = httpCookie.getValue();
            }
        }
        //如果令牌为空，则输出错误代码
        if (StringUtils.isEmpty(tokent)) {
            return this.getError(response, HttpStatus.METHOD_NOT_ALLOWED, "请鉴权"); //设置方法不允许被访问，405错误代码
        }

        Map<String,String> tmpMap;
        try {
            tmpMap=JWTUtils.getUserinfo(tokent);
        } catch (Exception e) {
            e.printStackTrace();
            return this.getError(response, HttpStatus.UNAUTHORIZED, "鉴权失败"); //解析失败，响应401错误
        }
        if(tmpMap==null){
            return this.getError(response, HttpStatus.UNAUTHORIZED, "鉴权失败，没有权限信息"); //解析失败，响应401错误
        }
        if(tmpMap.get("userid")==null || tmpMap.get("username")==null){
            return this.getError(response, HttpStatus.UNAUTHORIZED, "鉴权失败，用户信息出错"); //解析失败，响应401错误
        }
        System.out.println("userinfo:userid:"+tmpMap.get("userid")+",username:"+tmpMap.get("username")+",useremail:"+tmpMap.get("useremail")+",usermobile:"+tmpMap.get("usermobile")+",usertype:"+tmpMap.get("usertype"));

        //放行
        URI replaced = URI.create(exchange.getRequest().getURI().toString()
                +"&gwuserid="+this.sCode.ObjectToString(tmpMap.get("userid"))
                +"&gwusername="+this.sCode.ObjectToString(tmpMap.get("username"))
                +"&gwuseremail="+this.sCode.ObjectToString(tmpMap.get("useremail"))
                +"&gwusermobile="+this.sCode.ObjectToString(tmpMap.get("usermobile"))
                +"&gwusertype="+this.sCode.ObjectToString(tmpMap.get("usertype"))
        );

        System.out.println("replace to:"+replaced);

        ServerHttpRequest tmprequest = exchange.getRequest().mutate().uri(replaced).build();
        return chain.filter(exchange.mutate().request(tmprequest).build());
        /*
        exchange.mutate().request(new ServerHttpRequestDecorator(exchange.getRequest()) {
            @Override
            public URI getURI() {
                return replaced;
            }
            @Override
            public MultiValueMap<String, String> getQueryParams() {
                return UriComponentsBuilder.fromUri(replaced).build().getQueryParams();
            }
        }).build();
*/
    }

    /***
     * 过滤器执行顺序（越小越先执行）
     * @return
     */
    @Override
    public int getOrder() { return 0; }

    /*
    * 错误处理
    * */
    public Mono<Void> getError(ServerHttpResponse pResponse,HttpStatus pHttpStatus,String pMessage){
        pResponse.setStatusCode(pHttpStatus);
        JSONObject message = new JSONObject();
        message.put("code", "NOPOWER");
        message.put("message", pMessage);
        byte[] bits = message.toJSONString().getBytes(StandardCharsets.UTF_8);
        DataBuffer buffer = pResponse.bufferFactory().wrap(bits);
        pResponse.getHeaders().add("Content-Type", "text/plain;charset=UTF-8");
        return pResponse.writeWith(Mono.just(buffer));
    }
}

