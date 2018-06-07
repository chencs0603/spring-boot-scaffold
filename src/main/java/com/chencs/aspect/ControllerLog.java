package com.chencs.aspect;

import java.lang.annotation.*;

/**
 * @author: chencs
 * @date: 2018/5/15
 * @description:
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ControllerLog {

    String value() default "";

}
