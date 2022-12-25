package com.nets.productorder.productline.rest.Nets;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "productorder-demo")
public interface NetsuserinfoFeign {
    @RequestMapping(value = "/Plus/Common/netsuserinfo/getUserinfo" ,method = RequestMethod.GET)
    String getUserinfo();
}
