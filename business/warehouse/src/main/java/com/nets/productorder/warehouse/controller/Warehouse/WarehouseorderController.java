package com.nets.productorder.warehouse.controller.Warehouse;

import java.util.*;

import com.nets.productorder.coreentity.entity.Userinfo;
import com.nets.productorder.warehouse.service.Warehouse.WarehouseorderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nets.productorder.coreentity.entity.Warehouseorder;

import nets.unionnets.java_lib.util.Func.netsCode;
import nets.unionnets.java_lib.util.Entity.ResultCode;
import nets.unionnets.javaweb_lib.util.Html.ComPageSample;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/warehouseorder")
public class WarehouseorderController extends ComPageSample {
    /* 日志方法 */
    protected final Logger sLogger = LoggerFactory.getLogger(this.getClass());

    /* 服务 */
    @Autowired
    private WarehouseorderService sService;


    @GetMapping("/list")
    public ResultCode OnList(HttpServletRequest pRequest,Warehouseorder tmpPojo) {

        List<Warehouseorder> tmpList= this.sService.getFindAll();

        return ResultCode.success("data",(Object) tmpList);
    }
    @GetMapping("/normal")
    public ResultCode OnList(HttpServletRequest pRequest,String ids) {

        Warehouseorder tmpPojo= this.sService.OnNormal(ids);
        if(tmpPojo==null){
            tmpPojo=new Warehouseorder();
        }

        List<Warehouseorder> tmpListObject=new ArrayList<Warehouseorder>();
        tmpListObject.add(tmpPojo);
        Map<String,Object> tmpMapReturn=new HashMap<String,Object>();
        tmpMapReturn.put("data",tmpListObject);
        return ResultCode.success("data",tmpMapReturn);
    }
    @PostMapping("/add")
    public ResultCode OnAdd(HttpServletRequest pRequest,@RequestBody Warehouseorder tmpPojo) {
        this.getTokenEntity(pRequest);
        this.sService.setTokenEntity(this.sTokenEntity);

        int tmpInt= this.sService.OnAdd(tmpPojo);
        if(tmpInt!=0){
            return ResultCode.failure("系统内部出错，请重试");
        }

        return ResultCode.success();
    }
    @PostMapping("/modify")
    public ResultCode OnModify(HttpServletRequest pRequest,String ids,@RequestBody Warehouseorder tmpPojo) {
        this.getTokenEntity(pRequest);
        this.sService.setTokenEntity(this.sTokenEntity);

        int tmpInt= this.sService.OnModify(tmpPojo,ids);
        if(tmpInt!=0){
            return ResultCode.failure("系统内部出错，请重试");
        }

        return ResultCode.success();
    }
    @GetMapping("/delete")
    public ResultCode OnDelete(HttpServletRequest pRequest, String ids) {

        int tmpInt= this.sService.OnDelete(ids);
        if(tmpInt!=0){
            return ResultCode.failure("系统内部出错，请重试");
        }

        return ResultCode.success();
    }






}
