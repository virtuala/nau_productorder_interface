package com.nets.productorder.orderinfo.rest.Productline;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.nets.productorder.coreentity.entity.Productlineorderdetail;
import nets.unionnets.javaweb_lib.util.Rest.netsRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductlineorderdetailRestTemplate extends netsRestTemplate {

    public List<Productlineorderdetail> searchLastComplete(int pId){
        String tmpStrUrl="http://"+this.sConfigModule+"/"+this.sConfigModule1+"/searchLastComplete"+"?"+this.sTokenEntity.toUrl()
                +"&productlineId="+pId
                ;
        final String tmpStrReturn = this.sRestTemplate.getForObject(tmpStrUrl, String.class);
        Object tmpObject= JSON.parseObject(tmpStrReturn);
        Map<String,Object> tmpReutrn=(Map<String, Object>)tmpObject;
        JSONArray tmpReutrn1=(JSONArray)tmpReutrn.get("data");
        List tmpListResult=(List)tmpReutrn1;
        return tmpListResult;
    }


    public int OnAdd(Productlineorderdetail pProductlineorderdetail){
        String tmpStrUrl="http://"+this.sConfigModule+"/"+this.sConfigModule1+"/add"+"?"+this.sTokenEntity.toUrl()
                ;

        final String tmpStrReturn = this.sRestTemplate.postForObject(tmpStrUrl,pProductlineorderdetail, String.class);
        Object tmpObject= JSON.parseObject(tmpStrReturn);
        Map<String,Object> tmpReutrn=(Map<String, Object>)tmpObject;
        List<Map<String,Object>> tmpListResult=(List<Map<String, Object>>)tmpReutrn.get("data");
        return 0;
    }
    public int OnModify(Productlineorderdetail pProductlineorderdetail,int pId){
        String tmpStrUrl="http://"+this.sConfigModule+"/"+this.sConfigModule1+"/modify"+"?"+this.sTokenEntity.toUrl()
                +"&ids="+pId
                ;

        final String tmpStrReturn = this.sRestTemplate.postForObject(tmpStrUrl, pProductlineorderdetail,String.class);
        Object tmpObject=JSON.parseObject(tmpStrReturn);
        Map<String,Object> tmpReutrn=(Map<String, Object>)tmpObject;
        List<Map<String,Object>> tmpListResult=(List<Map<String, Object>>)tmpReutrn.get("data");
        return 0;
    }


}
