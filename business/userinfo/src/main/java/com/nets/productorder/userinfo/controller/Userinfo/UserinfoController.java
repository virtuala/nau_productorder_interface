package com.nets.productorder.userinfo.controller.Userinfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nets.productorder.userinfo.service.Userinfo.UserinfoService;
import nets.unionnets.java_lib.util.Entity.ResultCode;
import nets.unionnets.java_lib.util.Func.JWTUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nets.productorder.coreentity.entity.Userinfo;

import nets.unionnets.java_lib.util.Func.netsCode;
import nets.unionnets.java_lib.util.Entity.ResultCode;
import nets.unionnets.javaweb_lib.util.Html.ComPageSample;

@RestController
@RequestMapping("/userinfo")
public class UserinfoController extends ComPageSample {
    /* 日志方法 */
    protected final Logger sLogger = LoggerFactory.getLogger(this.getClass());

    /* 服务 */
    @Autowired
    private UserinfoService sService;



    @GetMapping("/1")
    public String OnList() {
        return "{\"code\":\"success\",\"message\",\"\"}";
    }
    @GetMapping("/")
    public String OnList2() {
        return "{\"code\":\"success\",\"message\",\"\"}";
    }


    @GetMapping("/list")
    public ResultCode OnList(Userinfo tmpPojo, Userinfo pAuth) {

        List<Userinfo> tmpList= this.sService.getFindAll();

        return ResultCode.success("data",(Object) tmpList);
    }
    @GetMapping("/normal")
    public ResultCode OnList(String ids, Userinfo pAuth) {

        Userinfo tmpPojo= this.sService.OnNormal(ids);
        if(tmpPojo==null){
            tmpPojo=new Userinfo();
        }

        List<Userinfo> tmpListObject=new ArrayList<Userinfo>();
        tmpListObject.add(tmpPojo);
        Map<String,Object> tmpMapReturn=new HashMap<String,Object>();
        tmpMapReturn.put("data",tmpListObject);
        return ResultCode.success("data",tmpMapReturn);
    }
    @PostMapping("/add")
    public ResultCode OnAdd(Userinfo tmpPojo,Userinfo pAuth) {

        if(tmpPojo.getUitPxd()==null){
            tmpPojo.setUitPxd(this.sCode.SamplePxd("123456"));
        }

        int tmpInt= this.sService.OnAdd(tmpPojo);
        if(tmpInt!=0){
            return ResultCode.failure("系统内部出错，请重试");
        }

        return ResultCode.success();
    }
    @PostMapping("/modify")
    public ResultCode OnModify(String ids,Userinfo tmpPojo,Userinfo pAuth) {

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


    /* S.custom */
    /*
    @Autowired
    private UserService service;
    */
    @RequestMapping("/login")
    public ResultCode login(String username, String password) {

        if (!StringUtils.hasLength(username) || !StringUtils.hasLength(password)) {
            return ResultCode.failure("帐号或者密码不能为空");
        }
        Userinfo tmpPojo = this.sService.selectByUserName(username);
        if (tmpPojo.getUitName()==null) {
            return ResultCode.failure("帐号不存在");
        }
        if (!this.sCode.SamplePxd(password).equals(tmpPojo.getUitPxd())) {
            return ResultCode.failure("密码错误");
        }

        Map<String,String> tmpMapReturn=new HashMap<String,String>();
        tmpMapReturn.put("token", JWTUtils.sign(this.sCode.ObjectToString(tmpPojo.getUitID()),username, password,tmpPojo.getUitEmail(),tmpPojo.getUitMobile(),this.sCode.ObjectToString(tmpPojo.getUitUserrole())));
        tmpMapReturn.put("id",this.sCode.ObjectToString(tmpPojo.getUitID()));
        tmpMapReturn.put("name",tmpPojo.getUitName());
        tmpMapReturn.put("numcode",tmpPojo.getUitNumCode());
        tmpMapReturn.put("role",this.sCode.ObjectToString(tmpPojo.getUitUserrole()));
        tmpMapReturn.put("email",tmpPojo.getUitEmail());
        tmpMapReturn.put("mobile",tmpPojo.getUitMobile());

        return ResultCode.success("data", tmpMapReturn);
    }
    /*
    @Autowired
    private UserService service;
    */
    @RequestMapping("/init")
    public ResultCode init(String username, String password, String passwordConfirm, String email, String mobile) {
        List<Userinfo> tmpData;
        Userinfo tmpPojo;

        if (!StringUtils.hasLength(username) || !StringUtils.hasLength(password)) {
            return ResultCode.failure("帐号或者密码不能为空");
        }
        if(!password.equals(passwordConfirm)){
            return ResultCode.failure("您两次填写的密码不一致");
        }
        tmpData=this.sService.getFindAll();
        if(tmpData.size()>0){
            return ResultCode.failure("无法初始化用户");
        }
        tmpPojo=new Userinfo();
        tmpPojo.setUitName_Fix(username);
        tmpPojo.setUitEmail_Fix(email);
        tmpPojo.setUitMobile_Fix(mobile);
        tmpPojo.setUitUserrole_Fix("1");
        tmpPojo.setUitPxd_Fix(this.sCode.SamplePxd(password));
        this.sService.OnAdd(tmpPojo);
        /*
        User user = service.selectByUserName(userName);
        if (user == null) {
            return ResultCode.failure("帐号不存在");
        }
        if (!encrypt(userName, password).equals(user.getPassword())) {
            return ResultCode.failure("密码错误");
        }
        */

        Map<String,String> tmpMapReturn=new HashMap<String,String>();
        tmpMapReturn.put("user",tmpPojo.getUitName());

        return ResultCode.success("data", tmpMapReturn);
    }
    /*
    @Autowired
    private UserService service;
    */
    @RequestMapping("/modifypassword")
    public ResultCode modifypassword(String userid, String password, String passwordOld, String passwordConfirm) {

        if (!StringUtils.hasLength(userid)) {
            return ResultCode.failure("请您登录");
        }
        if (!StringUtils.hasLength(password)) {
            return ResultCode.failure("请输入新密码");
        }
        if (!StringUtils.hasLength(passwordOld)) {
            return ResultCode.failure("请输入旧密码");
        }
        if(!password.equals(passwordConfirm)){
            return ResultCode.failure("您两次填写的密码不一致");
        }
        Userinfo tmpPojo = this.sService.selectByUserId(userid);
        if (tmpPojo.getUitName()==null) {
            return ResultCode.failure("帐号不存在");
        }
        if (!this.sCode.SamplePxd(passwordOld).equals(tmpPojo.getUitPxd())) {
            return ResultCode.failure("旧密码错误");
        }

        Userinfo tmpPojoModify=new Userinfo();
        tmpPojoModify.setUitPxd(this.sCode.SamplePxd(password));
        this.sService.OnModify(tmpPojoModify,userid);

        Map<String,String> tmpMapReturn=new HashMap<String,String>();
        tmpMapReturn.put("token", JWTUtils.sign(this.sCode.ObjectToString(tmpPojo.getUitID()),tmpPojo.getUitName(), password,tmpPojo.getUitEmail(),tmpPojo.getUitMobile(),this.sCode.ObjectToString(tmpPojo.getUitUserrole())));
        tmpMapReturn.put("id",this.sCode.ObjectToString(tmpPojo.getUitID()));
        tmpMapReturn.put("name",tmpPojo.getUitName());
        tmpMapReturn.put("numcode",tmpPojo.getUitNumCode());
        tmpMapReturn.put("role",this.sCode.ObjectToString(tmpPojo.getUitUserrole()));
        tmpMapReturn.put("email",tmpPojo.getUitEmail());
        tmpMapReturn.put("mobile",tmpPojo.getUitMobile());

        return ResultCode.success("data", tmpMapReturn);
    }
    /* E.custom */



}
