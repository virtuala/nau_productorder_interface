package com.nets.productorder.warehouse.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface NetsAopUserinfo {
    String value() default "";
}
