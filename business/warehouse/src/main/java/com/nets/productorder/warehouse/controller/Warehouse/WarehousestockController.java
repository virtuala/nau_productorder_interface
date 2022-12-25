package com.nets.productorder.warehouse.controller.Warehouse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nets.productorder.coreentity.entity.Userinfo;
import com.nets.productorder.warehouse.service.Warehouse.WarehousestockService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nets.productorder.coreentity.entity.Warehousestock;

import nets.unionnets.java_lib.util.Func.netsCode;
import nets.unionnets.java_lib.util.Entity.ResultCode;
import nets.unionnets.javaweb_lib.util.Html.ComPageSample;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/warehousestock")
public class WarehousestockController extends ComPageSample {
    /* 日志方法 */
    protected final Logger sLogger = LoggerFactory.getLogger(this.getClass());

    /* 服务 */
    @Autowired
    private WarehousestockService sService;


    @GetMapping("/list")
    public ResultCode OnList(HttpServletRequest pRequest,Warehousestock tmpPojo) {

        List<Warehousestock> tmpList= this.sService.getFindAll();

        return ResultCode.success("data",(Object) tmpList);
    }
    @GetMapping("/normal")
    public ResultCode OnList(HttpServletRequest pRequest,String ids) {

        Warehousestock tmpPojo= this.sService.OnNormal(ids);
        if(tmpPojo==null){
            tmpPojo=new Warehousestock();
        }

        List<Warehousestock> tmpListObject=new ArrayList<Warehousestock>();
        tmpListObject.add(tmpPojo);
        Map<String,Object> tmpMapReturn=new HashMap<String,Object>();
        tmpMapReturn.put("data",tmpListObject);
        return ResultCode.success("data",tmpMapReturn);
    }
    @PostMapping("/add")
    public ResultCode OnAdd(HttpServletRequest pRequest,@RequestBody Warehousestock tmpPojo) {
        this.getTokenEntity(pRequest);
        this.sService.setTokenEntity(this.sTokenEntity);

        int tmpInt= this.sService.OnAdd(tmpPojo);
        if(tmpInt!=0){
            return ResultCode.failure("系统内部出错，请重试");
        }

        return ResultCode.success();
    }
    @PostMapping("/modify")
    public ResultCode OnModify(HttpServletRequest pRequest,String ids,@RequestBody Warehousestock tmpPojo) {
        this.getTokenEntity(pRequest);
        this.sService.setTokenEntity(this.sTokenEntity);

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


    /* */
    @GetMapping("/searchCount")
    public ResultCode searchCount(HttpServletRequest pRequest,int productID){
        this.getTokenEntity(pRequest);
        this.sService.setTokenEntity(this.sTokenEntity);

        List<Map<String,Object>> tmpList= this.sService.searchCount(productID);

        return ResultCode.success("data",(Object) tmpList);
    }
    @GetMapping("/searchByProductID")
    public ResultCode searchByProductID(HttpServletRequest pRequest,int productID){
        this.getTokenEntity(pRequest);
        this.sService.setTokenEntity(this.sTokenEntity);

        List<Map<String,Object>> tmpList= this.sService.searchByProductID(productID);

        return ResultCode.success("data",(Object) tmpList);
    }
    @GetMapping("/searchByProductIDWarehouseID")
    public ResultCode searchByProductIDWarehouseID(HttpServletRequest pRequest, int productID, int warehouseID){
        this.getTokenEntity(pRequest);
        this.sService.setTokenEntity(this.sTokenEntity);

        List<Map<String,Object>> tmpList= this.sService.searchByProductIDWarehouseID(productID,warehouseID);

        return ResultCode.success("data",(Object) tmpList);
    }


}
