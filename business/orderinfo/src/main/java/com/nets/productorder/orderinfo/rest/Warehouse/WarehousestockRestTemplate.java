package com.nets.productorder.orderinfo.rest.Warehouse;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.nets.productorder.coreentity.entity.Productlineorderdetail;
import com.nets.productorder.coreentity.entity.Warehousestock;
import nets.unionnets.java_lib.util.Entity.ResultCode;
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

public class WarehousestockRestTemplate extends netsRestTemplate {

    public List<Map<String,Object>> searchCount(int productID){
        String tmpStrUrl="http://"+this.sConfigModule+"/"+this.sConfigModule1+"/searchCount"+"?"+this.sTokenEntity.toUrl()
                +"&productID="+productID
                ;
        final String tmpStrReturn = this.sRestTemplate.getForObject(tmpStrUrl, String.class);
        Object tmpObject=JSON.parseObject(tmpStrReturn);
        Map<String,Object> tmpReutrn=(Map<String, Object>)tmpObject;
        List<Map<String,Object>> tmpListResult=(List<Map<String, Object>>)tmpReutrn.get("data");
        return tmpListResult;
    }
    public List<Map<String,Object>> searchByProductID(int productID){
        String tmpStrUrl="http://"+this.sConfigModule+"/"+this.sConfigModule1+"/searchByProductID"+"?"+this.sTokenEntity.toUrl()
                +"&productID="+productID
                ;
        final String tmpStrReturn = this.sRestTemplate.getForObject(tmpStrUrl, String.class);
        Object tmpObject=JSON.parseObject(tmpStrReturn);
        Map<String,Object> tmpReutrn=(Map<String, Object>)tmpObject;
        List<Map<String,Object>> tmpListResult=(List<Map<String, Object>>)tmpReutrn.get("data");
        return tmpListResult;
    }
    public List<Map<String,Object>> searchByProductIDWarehouseID(int productID,int warehouseID){
        String tmpStrUrl="http://"+this.sConfigModule+"/"+this.sConfigModule1+"/searchByProductIDWarehouseID"+"?"+this.sTokenEntity.toUrl()
                +"&productID="+productID
                +"&productID="+warehouseID
                ;
        final String tmpStrReturn = this.sRestTemplate.getForObject(tmpStrUrl, String.class);
        Object tmpObject=JSON.parseObject(tmpStrReturn);
        Map<String,Object> tmpReutrn=(Map<String, Object>)tmpObject;
        List<Map<String,Object>> tmpListResult=(List<Map<String, Object>>)tmpReutrn.get("data");
        return tmpListResult;
    }

    public int OnAdd(Warehousestock pWarehousestock){
        String tmpStrUrl="http://"+this.sConfigModule+"/"+this.sConfigModule1+"/add"+"?"+this.sTokenEntity.toUrl()
                ;

        final String tmpStrReturn = this.sRestTemplate.postForObject(tmpStrUrl, pWarehousestock, String.class);
        Object tmpObject=JSON.parseObject(tmpStrReturn);
        Map<String,Object> tmpReutrn=(Map<String, Object>)tmpObject;
        List<Map<String,Object>> tmpListResult=(List<Map<String, Object>>)tmpReutrn.get("data");
        return 0;
    }
    public int OnModify(Warehousestock pWarehousestock,int pId){
        String tmpStrUrl="http://"+this.sConfigModule+"/"+this.sConfigModule1+"/modify"+"?"+this.sTokenEntity.toUrl()
                +"&ids="+pId
                ;

        final String tmpStrReturn = this.sRestTemplate.postForObject(tmpStrUrl, pWarehousestock, String.class);
        Object tmpObject=JSON.parseObject(tmpStrReturn);
        Map<String,Object> tmpReutrn=(Map<String, Object>)tmpObject;
        List<Map<String,Object>> tmpListResult=(List<Map<String, Object>>)tmpReutrn.get("data");
        return 0;
    }



}
