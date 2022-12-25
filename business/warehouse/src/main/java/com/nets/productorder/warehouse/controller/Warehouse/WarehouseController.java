package com.nets.productorder.warehouse.controller.Warehouse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nets.productorder.coreentity.entity.Userinfo;
import com.nets.productorder.warehouse.service.Warehouse.WarehouseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nets.productorder.coreentity.entity.Warehouse;

import nets.unionnets.java_lib.util.Func.netsCode;
import nets.unionnets.java_lib.util.Entity.ResultCode;
import nets.unionnets.javaweb_lib.util.Html.ComPageSample;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/warehouse")
public class WarehouseController extends ComPageSample {
    /* 日志方法 */
    protected final Logger sLogger = LoggerFactory.getLogger(this.getClass());

    /* 服务 */
    @Autowired
    private WarehouseService sService;


    @GetMapping("/list")
    public ResultCode OnList(HttpServletRequest pRequest,Warehouse tmpPojo) {

        List<Warehouse> tmpList= this.sService.getFindAll();

        return ResultCode.success("data",(Object) tmpList);
    }
    @GetMapping("/normal")
    public ResultCode OnList(HttpServletRequest pRequest,String ids) {

        Warehouse tmpPojo= this.sService.OnNormal(ids);
        if(tmpPojo==null){
            tmpPojo=new Warehouse();
        }

        List<Warehouse> tmpListObject=new ArrayList<Warehouse>();
        tmpListObject.add(tmpPojo);
        Map<String,Object> tmpMapReturn=new HashMap<String,Object>();
        tmpMapReturn.put("data",tmpListObject);
        return ResultCode.success("data",tmpMapReturn);
    }
    @PostMapping("/add")
    public ResultCode OnAdd(HttpServletRequest pRequest,Warehouse tmpPojo) {

        int tmpInt= this.sService.OnAdd(tmpPojo);
        if(tmpInt!=0){
            return ResultCode.failure("系统内部出错，请重试");
        }

        return ResultCode.success();
    }
    @PostMapping("/modify")
    public ResultCode OnModify(HttpServletRequest pRequest,String ids,Warehouse tmpPojo) {

        int tmpInt= this.sService.OnModify(tmpPojo,ids);
        if(tmpInt!=0){
            return ResultCode.failure("系统内部出错，请重试");
        }

        return ResultCode.success();
    }
    @GetMapping("/delete")
    public ResultCode OnDelete(HttpServletRequest pRequest,String ids) {

        int tmpInt= this.sService.OnDelete(ids);
        if(tmpInt!=0){
            return ResultCode.failure("系统内部出错，请重试");
        }

        return ResultCode.success();
    }

    /***/
    @GetMapping("/searchByFirstId")
    public ResultCode searchByFirstId(HttpServletRequest pRequest){
        this.getTokenEntity(pRequest);
        this.sService.setTokenEntity(this.sTokenEntity);

        List<Map<String,Object>> tmpList= this.sService.searchByFirstId();

        return ResultCode.success("data",(Object) tmpList);
    }





}
