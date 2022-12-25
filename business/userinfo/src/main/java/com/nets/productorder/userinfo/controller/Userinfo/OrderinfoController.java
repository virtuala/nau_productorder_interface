package com.nets.productorder.userinfo.controller.Userinfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSON;
import com.nets.productorder.coreentity.entity.Userinfo;
import com.nets.productorder.userinfo.annotation.NetsAopUserinfo;
import com.nets.productorder.userinfo.service.Userinfo.OrderinfoService;
import nets.unionnets.java_lib.util.Entity.ResultCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nets.productorder.coreentity.entity.Orderinfo;

import nets.unionnets.java_lib.util.Func.netsCode;
import nets.unionnets.java_lib.util.Entity.ResultCode;
import nets.unionnets.javaweb_lib.util.Html.ComPageSample;

@RestController
@RequestMapping("/orderinfo")
public class OrderinfoController extends ComPageSample {
    /* 日志方法 */
    protected final Logger sLogger = LoggerFactory.getLogger(this.getClass());

    /* 服务 */
    @Autowired
    private OrderinfoService sService;


    @GetMapping("/list")
    public ResultCode OnList(Orderinfo tmpPojo, Userinfo pAuth) {

        List<Orderinfo> tmpList= this.sService.getFindAll();

        return ResultCode.success("data",(Object) tmpList);
    }
    @GetMapping("/normal")
    public ResultCode OnList(String ids, Userinfo pAuth) {

        Orderinfo tmpPojo= this.sService.OnNormal(ids);
        if(tmpPojo==null){
            tmpPojo=new Orderinfo();
        }

        List<Orderinfo> tmpListObject=new ArrayList<Orderinfo>();
        tmpListObject.add(tmpPojo);
        Map<String,Object> tmpMapReturn=new HashMap<String,Object>();
        tmpMapReturn.put("data",tmpListObject);
        return ResultCode.success("data",tmpMapReturn);
    }
    @PostMapping("/add")
    public ResultCode OnAdd(Orderinfo tmpPojo,Userinfo pAuth) {

        int tmpInt= this.sService.OnAdd(tmpPojo);
        if(tmpInt!=0){
            return ResultCode.failure("系统内部出错，请重试");
        }

        return ResultCode.success("success");
    }
    @PostMapping("/addJson")
    public ResultCode OnAddJson(HttpServletRequest pRequest, Userinfo pAuth) {
        String tmpStrJson=this.AnalyerRequestFill(pRequest,"json","[]",0);
        List tmpJson=JSON.parseObject(tmpStrJson,List.class);

        int tmpInt= this.sService.OnAddJson(tmpJson);
        if(tmpInt!=0){
            return ResultCode.failure("系统内部出错，请重试");
        }

        return ResultCode.success("success");
    }
    @PostMapping("/modify")
    public ResultCode OnModify(String ids,Orderinfo tmpPojo,Userinfo pAuth) {

        int tmpInt= this.sService.OnModify(tmpPojo,ids);
        if(tmpInt!=0){
            return ResultCode.failure("系统内部出错，请重试");
        }

        return ResultCode.success();
    }
    @GetMapping("/delete")
    public ResultCode OnDelete(String ids,Userinfo pAuth) {

        int tmpInt= this.sService.OnDelete(ids);
        if(tmpInt!=0){
            return ResultCode.failure("系统内部出错，请重试");
        }

        return ResultCode.success();
    }






}
