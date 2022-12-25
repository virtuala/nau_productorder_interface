package com.nets.productorder.product.rest.Warehouse;

import com.alibaba.fastjson.JSON;
import nets.unionnets.javaweb_lib.util.Rest.netsRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Component
public class WarehousestockRestTemplate extends netsRestTemplate {

    public List<Map<String,Object>> searchCount(int pId){
        String tmpStrUrl="http://"+this.sConfigModule+"/"+this.sConfigModule1+"/searchCount?"+"&productID="+pId+this.sTokenEntity.toUrl();
        final String tmpStrReturn = this.sRestTemplate.getForObject(tmpStrUrl, String.class);
        Object tmpObject= JSON.parseObject(tmpStrReturn);
        Map<String,Object> tmpReutrn=(Map<String, Object>)tmpObject;
        List<Map<String,Object>> tmpListResult=(List<Map<String, Object>>)tmpReutrn.get("data");
        return tmpListResult;
    }

}
