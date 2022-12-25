package com.nets.productorder.userinfo.rest.Warehouse;

import nets.unionnets.javaweb_lib.util.Rest.netsRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

public class WarehouseorderRestTemplate extends netsRestTemplate {

    public String getHello(){
        final String forObject = this.sRestTemplate.getForObject("http://alibaba-nacos-config-client/hello", String.class);
        return forObject;
    }

}
