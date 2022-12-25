package com.nets.productorder.product.config;

import com.nets.productorder.product.filter.UserinfoInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;
import java.io.FileNotFoundException;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String tmpProjectRoot = null;
        try {
            tmpProjectRoot = new File(ResourceUtils.getURL("classpath:").getPath()).getParentFile().getParentFile().getParent();

            if(tmpProjectRoot.substring(0,6).equals("file:\\")){
                tmpProjectRoot=tmpProjectRoot.substring(6,tmpProjectRoot.length());
            }
            if(tmpProjectRoot.substring(0,6).equals("file:/")){
                tmpProjectRoot=tmpProjectRoot.substring(5,tmpProjectRoot.length());
            }
            tmpProjectRoot += "/file/upload/";
            registry.addResourceHandler("/api/upload/**")
                    .addResourceLocations("file:" + tmpProjectRoot);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /*
    已在网关处处理不用再次验证
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").
                        allowedOrigins("*"). //允许跨域的域名，可以用*表示允许任何域名使用
                        allowedMethods("*"). //允许任何方法（post、get等）
                        allowedHeaders("*"). //允许任何请求头
                        allowCredentials(true). //带上cookie信息
                        exposedHeaders(HttpHeaders.SET_COOKIE).maxAge(3600L); //maxAge(3600)表明在3600秒内，不需要再发送预检验请求，可以缓存该结果
            }
        };
    }
    */

    /**
     * 添加拦截器-用户信息与接口
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //静态资源不拦截
        registry.addInterceptor(new UserinfoInterceptor())
                .addPathPatterns("/**")

                .excludePathPatterns("/heath/","/product/searchWithWarehouse","/product/searchCount","/userinfo/login","/userinfo/init")
                /*
                .excludePathPatterns("/api/ucenter/logout")
                .excludePathPatterns("/api/ucenter/makePasswordEncode")
                .excludePathPatterns("/api/ucenter/getCaptcha")
                .excludePathPatterns("/api/upload/**")
                */
        ;
    }

}

