package com.chencs.controller;

import com.chencs.aspect.ControllerLog;
import com.chencs.dao.LogDao;
import com.chencs.entity.Log;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: chencs
 * @date: 2018/6/7
 */
@RestController
@RequestMapping("/logs")
public class LogController {

    @Autowired
    private LogDao logDao;

    @GetMapping
    @ControllerLog
    @ApiOperation(value = "获取日志列表", notes = "获取日志列表")
    public List<Log> queryList() {
        return logDao.queryList(0, 10);
    }

    @GetMapping("/{id}")
    @ControllerLog
    @ApiOperation(value = "获取单个日志信息", notes = "获取单个日志信息")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "id", value = "id", required = true, paramType = "path", dataType = "long")
    })
    public Log queryOne(@PathVariable Long id) {
        return logDao.queryOne(id);
    }

}
