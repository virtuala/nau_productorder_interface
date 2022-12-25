package com.nets.productorder.product.controller.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRule;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRuleManager;
import com.alibaba.fastjson.JSON;
import com.nets.productorder.coreentity.entity.Userinfo;
import com.nets.productorder.product.service.Product.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nets.productorder.coreentity.entity.Product;

import nets.unionnets.java_lib.util.Func.netsCode;
import nets.unionnets.java_lib.util.Entity.ResultCode;
import nets.unionnets.javaweb_lib.util.Html.ComPageSample;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/product")
public class ProductController extends ComPageSample {
    /* 日志方法 */
    protected final Logger sLogger = LoggerFactory.getLogger(this.getClass());

    /* 服务 */
    @Autowired
    private ProductService sService;


    @GetMapping("/list")
    public ResultCode OnList(Product tmpPojo, Userinfo pAuth) {

        List<Product> tmpList= this.sService.getFindAll();

        return ResultCode.success("data",(Object) tmpList);
    }
    @GetMapping("/normal")
    public ResultCode OnList(String ids, Userinfo pAuth) {

        Product tmpPojo= this.sService.OnNormal(ids);
        if(tmpPojo==null){
            tmpPojo=new Product();
        }

        List<Product> tmpListObject=new ArrayList<Product>();
        tmpListObject.add(tmpPojo);
        Map<String,Object> tmpMapReturn=new HashMap<String,Object>();
        tmpMapReturn.put("data",tmpListObject);
        return ResultCode.success("data",tmpMapReturn);
    }
    @PostMapping("/add")
    public ResultCode OnAdd(Product tmpPojo,Userinfo pAuth) {

        int tmpInt= this.sService.OnAdd(tmpPojo);
        if(tmpInt!=0){
            return ResultCode.failure("系统内部出错，请重试");
        }

        return ResultCode.success();
    }
    @PostMapping("/modify")
    public ResultCode OnModify(String ids,Product tmpPojo,Userinfo pAuth) {

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

    /**/
    @SentinelResource(value = "searchWithWarehouse", blockHandler = "searchWithWarehouseQpsFlowException", fallback = "searchWithWarehouseQpsFlowFallback")
    @GetMapping("/searchWithWarehouse")
    public ResultCode searchWithWarehouse(HttpServletRequest pRequest) {
        this.getTokenEntity(pRequest);
        this.sService.setTokenEntity(this.sTokenEntity);

        List<Map<String,Object>> tmpList= this.sService.searchWithWarehouse();

        return ResultCode.success("data",(Object) tmpList);
    }
    /* 应用限流 */
    public ResultCode searchWithWarehouseQpsFlowException(HttpServletRequest pRequest,BlockException e) {
        //熔断降级
        e.printStackTrace();
        return ResultCode.failure("请休息一会再访问应用");
    }
    public ResultCode searchWithWarehouseQpsFlowFallback(HttpServletRequest pRequest,Throwable e) {
        //异常限流
        e.printStackTrace();
        return ResultCode.failure("服务内部异常");
    }

    @PostConstruct
    public void initDegradeRule() {
        //限流配置
        List<DegradeRule> tmpRules = new ArrayList<>();
        DegradeRule tmpRuleRow;

        tmpRuleRow = new DegradeRule();
        tmpRuleRow.setResource("searchWithWarehouse"); // 80s内调用接口出现异常次数超过5的时候, 进行熔断
        tmpRuleRow.setCount(5).setTimeWindow(80).setGrade(RuleConstant.DEGRADE_GRADE_EXCEPTION_COUNT);
        tmpRules.add(tmpRuleRow);

        /*
        tmpRuleRow = new DegradeRule();
        tmpRuleRow.setResource("searchWithWarehouse"); // 20s内调用接口次数超过2的时候, 进行限流
        tmpRuleRow.setCount(2).setTimeWindow(20).setGrade(RuleConstant.FLOW_GRADE_QPS);
        tmpRules.add(tmpRuleRow);
       */

        DegradeRuleManager.loadRules(tmpRules);
    }


}
