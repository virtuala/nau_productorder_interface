package com.nets.productorder.userinfo.controller.Userinfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nets.productorder.coreentity.entity.Userinfo;
import com.nets.productorder.userinfo.service.Userinfo.WarehouseorderdetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nets.productorder.coreentity.entity.Warehouseorderdetail;

import nets.unionnets.java_lib.util.Func.netsCode;
import nets.unionnets.java_lib.util.Entity.ResultCode;
import nets.unionnets.javaweb_lib.util.Html.ComPageSample;

@RestController
@RequestMapping("/warehouseorderdetail")
public class WarehouseorderdetailController extends ComPageSample {
    /* 日志方法 */
    protected final Logger sLogger = LoggerFactory.getLogger(this.getClass());

    /* 服务 */
    @Autowired
    private WarehouseorderdetailService sService;


    @GetMapping("/list")
    public ResultCode OnList(Warehouseorderdetail tmpPojo, Userinfo pAuth) {

        List<Warehouseorderdetail> tmpList= this.sService.getFindAll();

        return ResultCode.success("data",(Object) tmpList);
    }
    @GetMapping("/normal")
    public ResultCode OnList(String ids, Userinfo pAuth) {

        Warehouseorderdetail tmpPojo= this.sService.OnNormal(ids);
        if(tmpPojo==null){
            tmpPojo=new Warehouseorderdetail();
        }

        List<Warehouseorderdetail> tmpListObject=new ArrayList<Warehouseorderdetail>();
        tmpListObject.add(tmpPojo);
        Map<String,Object> tmpMapReturn=new HashMap<String,Object>();
        tmpMapReturn.put("data",tmpListObject);
        return ResultCode.success("data",tmpMapReturn);
    }
    @PostMapping("/add")
    public ResultCode OnAdd(Warehouseorderdetail tmpPojo,Userinfo pAuth) {

        int tmpInt= this.sService.OnAdd(tmpPojo);
        if(tmpInt!=0){
            return ResultCode.failure("系统内部出错，请重试");
        }

        return ResultCode.success();
    }
    @PostMapping("/modify")
    public ResultCode OnModify(String ids,Warehouseorderdetail tmpPojo,Userinfo pAuth) {

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
