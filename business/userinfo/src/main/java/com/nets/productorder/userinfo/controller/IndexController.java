package com.nets.productorder.userinfo.controller;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.netflix.client.http.HttpRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nets.productorder.userinfo.annotation.*;

import com.nets.productorder.coreentity.entity.Userinfo;

@RestController
@EnableAutoConfiguration
@ComponentScan
@RequestMapping("/one")
public class IndexController {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${productorder.test}")
    public String testvalue;
    @Value("${spring.cloud.nacos.discovery.server-addr}")
    public String nacos_host;
    @Value("${server.port}")
    public String port;

    public String KEY="somekey";

    @NetsAopUserinfo("这是日志内容")
    @GetMapping("/getInfo")
    public String OnList(HttpRequest request, @RequestParam("temp") String temp, @RequestParam("username1") String username1, Userinfo pUserinfo) {



        if("".equals(temp)){
            temp="";
        }

        /*
        HttpHeaders tokent = request.getHttpHeaders();
String username=tokent.getFirstValue("username");

         */

        if("".equals(username1)){
            username1="";
        }


        logger.info("logback 访问hello --- :"+pUserinfo.getUitName());
        return "{\"code\":\"success\",\"message\",\"testvalue:"+this.testvalue+"/port:"+this.port+"/nacos_host:"+this.nacos_host+"/temp:"+temp+"/username:"+username1+"\"}";
    }

    //@SentinelResource(value = "getOrderInfo", blockHandler = "handleFlowQpsException", fallback = "queryOrderInfo2Fallback")
    @GetMapping("/getOrder")
    public String GetOrder(@RequestParam("id") String pID) {
        logger.info("logback 访问 getOrder");

        /*
        try {
            Thread.sleep(5000);
        }catch (Exception except){
            logger.info("logback 访问 getOrder - Thread.sleep");
        }
        */

        /*
        try {
            // Your business logic here.
            System.out.println("hello world");
        } catch (BlockException e) {
            // Handle rejected request.
            e.printStackTrace();
        }
        */

        // 模拟接口运行时抛出代码异常
        if ("000".equals(pID)) {
            throw new RuntimeException();
        }

        return "{\"code\":\"success\",\"message\",\"getOrder\"}";
    }

    /**
     * 订单查询接口抛出限流或降级时的处理逻辑
     *
     * 注意: 方法参数、返回值要与原函数保持一致
     * @return
     */
    public String handleFlowQpsException(String orderId, BlockException e) {
        e.printStackTrace();
        return "handleFlowQpsException for queryOrderInfo2: " + orderId;
    }
    /**
     * 订单查询接口运行时抛出的异常提供fallback处理
     *
     * 注意: 方法参数、返回值要与原函数保持一致
     * @return
     */
    public String queryOrderInfo2Fallback(String orderId, Throwable e) {
        return "fallback queryOrderInfo2: " + orderId;
    }


}
