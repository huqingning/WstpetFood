package com.wst.wstfoodsever.service;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ExceptionInspect {
    String id() default "";
    String name() default "";
}
