package com.nets.productorder.product.filter;

import com.alibaba.fastjson.JSON;
import nets.unionnets.java_lib.util.Entity.ResultCode;
import nets.unionnets.java_lib.util.Func.netsCode;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@Component
public class UserinfoInterceptor extends HandlerInterceptorAdapter {

    protected netsCode sCode=netsCode.getInstance();

    /**
     * 检查是否已经登录
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("MyInterceptor.preHandle");

        Map<String,String> tmpMap=new HashMap<>();

        tmpMap.put("userid",this.sCode.ObjectToString(request.getParameter("gwuserid")));
        tmpMap.put("username",this.sCode.ObjectToString(request.getParameter("gwusername")));
        tmpMap.put("useremail",this.sCode.ObjectToString(request.getParameter("gwuseremail")));
        tmpMap.put("usermobile",this.sCode.ObjectToString(request.getParameter("gwusermobile")));
        tmpMap.put("usertype",this.sCode.ObjectToString(request.getParameter("gwusertype")));

        if(tmpMap.get("userid").equals("") || tmpMap.get("username").equals("")){
            this.setHttpJsonBody(ResultCode.failure("用户权限不正确，请重新登录"),response);
            return false;
        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        System.out.println("MyInterceptor.postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        System.out.println("MyInterceptor.afterCompletion");
    }

    protected void setHttpJsonBody(ResultCode pResultCode, HttpServletResponse response) throws IOException {
        response.setContentType("application/json; charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.print(JSON.toJSONString(pResultCode));
        writer.close();
        response.flushBuffer();
    }

}
