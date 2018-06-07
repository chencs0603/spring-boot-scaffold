package com.chencs.controller;

import com.chencs.aspect.ControllerLog;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: chencs
 * @date: 2018/6/7
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    @ControllerLog
    public String hello() {
        return "hello world";
    }
}
