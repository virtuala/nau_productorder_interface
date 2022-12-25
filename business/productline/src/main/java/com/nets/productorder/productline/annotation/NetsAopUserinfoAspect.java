package com.nets.productorder.productline.annotation;

import com.nets.productorder.coreentity.entity.Userinfo;
import nets.unionnets.java_lib.util.Func.netsCode;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Component
@Aspect
public class NetsAopUserinfoAspect {

    protected netsCode sCode=netsCode.getInstance();

    @Pointcut("@annotation(com.nets.productorder.productline.annotation.NetsAopUserinfo)")
    private void pointcut() {}

    /*
    joinPoint : 是引用方法的参数
    KthLog logger : 是KthLog(xxx)的参数
     */
    @Before("pointcut() && @annotation(logger)")
    public Object advice(JoinPoint joinPoint, NetsAopUserinfo logger) {
        System.out.println("注解作用的方法名: " + joinPoint.getSignature().getName());
        System.out.println("所在类的简单类名: " + joinPoint.getSignature().getDeclaringType().getSimpleName());
        System.out.println("所在类的完整类名: " + joinPoint.getSignature().getDeclaringType());

        //System.out.println("目标方法的声明类型: " + Modifier.toString(joinPoint.getSignature().getModifiers()));

        System.out.println("--- Kth日志的内容为[" + logger.value() + "] ---");

        Object[] result;
        Map<String,String> resultMap = new HashMap<String,String>();

        //取得HTTP传参
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes sra = (ServletRequestAttributes)ra;
        HttpServletRequest request = sra.getRequest();

        resultMap.put("userid",this.sCode.ObjectToString(request.getParameter("gwuserid")));
        resultMap.put("username",this.sCode.ObjectToString(request.getParameter("gwusername")));
        resultMap.put("useremail",this.sCode.ObjectToString(request.getParameter("gwuseremail")));
        resultMap.put("usermobile",this.sCode.ObjectToString(request.getParameter("gwusermobile")));
        resultMap.put("usertype",this.sCode.ObjectToString(request.getParameter("gwusertype")));

        System.out.println("--- Kth日志的内容为[username:" + resultMap.get("username") + "] ---");

        try {
            result = joinPoint.getArgs();
            Userinfo tmpUserinfo=(Userinfo) result[3];
            tmpUserinfo.setUitID(this.sCode.ToInt32(resultMap.get("userid"),0));
            tmpUserinfo.setUitName(resultMap.get("username"));
            tmpUserinfo.setUitEmail(resultMap.get("useremail"));
            tmpUserinfo.setUitMobile(resultMap.get("usermobile"));
            tmpUserinfo.setUitUserrole(this.sCode.ToInt32(resultMap.get("usertype"),0));
            result[3]=(Object)tmpUserinfo;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        return resultMap;
    }

}
