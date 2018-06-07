package com.chencs.dao;

import com.chencs.ApplicationTests;
import com.chencs.entity.Log;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @author: chencs
 * @date: 2018/6/7
 */
public class LogDaoTest extends ApplicationTests {

    @Autowired
    private LogDao logDao;

    @Test
    public void save() {
        Log log = new Log("127.0.0.1", "/hello", "hello", "", "", 12, new Date());
        logDao.save(log);
    }
}
