package com.chencs.aspect;

import java.lang.annotation.*;

/**
 * 注解
 *
 * @author: chencs
 * @date: 2018/5/15
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ControllerLog {

    String value() default "";

}
