package com.chencs.controller;

import com.chencs.aspect.ControllerLog;
import com.chencs.dao.LogDao;
import com.chencs.entity.Log;
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
    public List<Log> queryList() {
        return logDao.queryList(0, 10);
    }

    @GetMapping("/{id}")
    @ControllerLog
    public Log queryOne(@PathVariable Long id) {
        return logDao.queryOne(id);
    }

}
