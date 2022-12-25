package com.nets.productorder.orderinfo.rest.Warehouse;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.nets.productorder.coreentity.entity.Productlineorderdetail;
import com.nets.productorder.coreentity.entity.Warehouseorder;
import nets.unionnets.javaweb_lib.util.Rest.netsRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WarehouseorderRestTemplate extends netsRestTemplate {

    public int OnAdd(Warehouseorder pWarehouseorder){
        String tmpStrUrl="http://"+this.sConfigModule+"/"+this.sConfigModule1+"/add"+"?"+this.sTokenEntity.toUrl()
                ;

        final String tmpStrReturn = this.sRestTemplate.postForObject(tmpStrUrl, pWarehouseorder, String.class);
        Object tmpObject=JSON.parseObject(tmpStrReturn);
        Map<String,Object> tmpReutrn=(Map<String, Object>)tmpObject;
        List<Map<String,Object>> tmpListResult=(List<Map<String, Object>>)tmpReutrn.get("data");
        return 0;
    }
    public int OnModify(Warehouseorder pWarehouseorder,int pId){
        String tmpStrUrl="http://"+this.sConfigModule+"/"+this.sConfigModule1+"/modify"+"?"+this.sTokenEntity.toUrl()
                +"&ids="+pId
                ;

        final String tmpStrReturn = this.sRestTemplate.postForObject(tmpStrUrl, pWarehouseorder, String.class);
        Object tmpObject=JSON.parseObject(tmpStrReturn);
        Map<String,Object> tmpReutrn=(Map<String, Object>)tmpObject;
        List<Map<String,Object>> tmpListResult=(List<Map<String, Object>>)tmpReutrn.get("data");
        return 0;
    }



}
