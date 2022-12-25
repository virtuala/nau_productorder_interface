package com.nets.productorder.gateway.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import nets.unionnets.java_lib.util.Func.JWTUtils;

@RestController
@EnableAutoConfiguration
@ComponentScan
@RequestMapping("/")
public class IndexController {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${productorder.test}")
    public String testvalue;
    @Value("${spring.cloud.nacos.discovery.server-addr}")
    public String nacos_host;
    @Value("${server.tokenkey}")
    public String sTokenKey;

    @GetMapping("/")
    public String OnList() {
        return "{\"code\":\"success\",\"message\":\""+this.testvalue+"\"}";
    }
    @GetMapping("/makeusertoken")
    public String OnMakeUserToken() {
        String tmpUserName="virtuala";
        String tmpUserPxd="123123";
        String tmpToken=JWTUtils.sign("1",tmpUserName,this.sTokenKey,"","","");
        return "{\"code\":\"success\",\"message\":\""+tmpToken+"\"}";
    }





}
