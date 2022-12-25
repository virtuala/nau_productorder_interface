package com.nets.productorder.userinfo.exception;

import com.nets.netsjframe.corelib.exception.MainExceptionHandler;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @apiNote 全局异常处理
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.OK)
    public Object errorHandler(Exception e, HttpServletRequest httpServletRequest) {
        MainExceptionHandler tmpHandler=new MainExceptionHandler();
        return tmpHandler.errorHandler(e,httpServletRequest);
    }

}
