package com.nets.productorder.orderinfo.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface NetsAopUserinfo {
    String value() default "";
}
