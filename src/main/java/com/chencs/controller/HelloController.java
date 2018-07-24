package com.chencs.controller;

import com.chencs.aspect.ControllerLog;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: chencs
 * @date: 2018/6/7
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    @ControllerLog
    @ApiOperation(value = "hello world", notes = "hello world")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/exception")
    @ControllerLog
    @ApiOperation(value = "抛出异常", notes = "抛出异常")
    public String exception() {
        throw new RuntimeException();
    }

}
