package com.nets.productorder.userinfo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan
@RequestMapping("/two")
public class TwoController {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${productorder.test}")
    public String testvalue;
    @Value("${spring.cloud.nacos.discovery.server-addr}")
    public String nacos_host;

    @GetMapping("/getInfo")
    public String OnList() {
        return "{\"code\":\"success\",\"message\",\""+this.testvalue+"/"+this.nacos_host+"\"}";
    }





}