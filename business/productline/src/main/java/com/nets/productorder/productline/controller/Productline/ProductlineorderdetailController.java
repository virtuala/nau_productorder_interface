package com.nets.productorder.productline.controller.Productline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nets.productorder.coreentity.entity.Userinfo;
import com.nets.productorder.productline.service.Productline.ProductlineorderdetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nets.productorder.coreentity.entity.Productlineorderdetail;

import nets.unionnets.java_lib.util.Func.netsCode;
import nets.unionnets.java_lib.util.Entity.ResultCode;
import nets.unionnets.javaweb_lib.util.Html.ComPageSample;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/productlineorderdetail")
public class ProductlineorderdetailController extends ComPageSample {
    /* 日志方法 */
    protected final Logger sLogger = LoggerFactory.getLogger(this.getClass());

    /* 服务 */
    @Autowired
    private ProductlineorderdetailService sService;


    @GetMapping("/list")
    public ResultCode OnList(Productlineorderdetail tmpPojo, Userinfo pAuth) {

        List<Productlineorderdetail> tmpList= this.sService.getFindAll();

        return ResultCode.success("data",(Object) tmpList);
    }
    @GetMapping("/normal")
    public ResultCode OnList(String ids, Userinfo pAuth) {

        Productlineorderdetail tmpPojo= this.sService.OnNormal(ids);
        if(tmpPojo==null){
            tmpPojo=new Productlineorderdetail();
        }

        List<Productlineorderdetail> tmpListObject=new ArrayList<Productlineorderdetail>();
        tmpListObject.add(tmpPojo);
        Map<String,Object> tmpMapReturn=new HashMap<String,Object>();
        tmpMapReturn.put("data",tmpListObject);
        return ResultCode.success("data",tmpMapReturn);
    }
    @PostMapping("/add")
    public ResultCode OnAdd(HttpServletRequest pRequest, @RequestBody Productlineorderdetail tmpPojo) {
        this.getTokenEntity(pRequest);
        this.sService.setTokenEntity(this.sTokenEntity);

        int tmpInt= this.sService.OnAdd(tmpPojo);
        if(tmpInt!=0){
            return ResultCode.failure("系统内部出错，请重试");
        }

        return ResultCode.success();
    }
    @PostMapping("/modify")
    public ResultCode OnModify(HttpServletRequest pRequest,String ids,@RequestBody Productlineorderdetail tmpPojo) {
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

    @PostMapping("/complete")
    public ResultCode OnComplete(HttpServletRequest pRequest,String pId) {
        this.getTokenEntity(pRequest);
        this.sService.setTokenEntity(this.sTokenEntity);

        int tmpInt= this.sService.OnComplete(pId);
        if(tmpInt!=0){
            return ResultCode.failure("系统内部出错，请重试");
        }

        return ResultCode.success();
    }

    /***/
    @GetMapping("/searchLastComplete")
    public ResultCode searchLastComplete(HttpServletRequest pRequest,String productlineId) {
        this.getTokenEntity(pRequest);
        this.sService.setTokenEntity(this.sTokenEntity);

        List<Productlineorderdetail> tmpList= this.sService.searchLastComplete(this.sCode.ToInt32(this.sCode.ObjectToString(productlineId),0));

        return ResultCode.success("data", tmpList);
    }



}
