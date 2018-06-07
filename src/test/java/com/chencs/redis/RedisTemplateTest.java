package com.chencs.redis;

import com.chencs.ApplicationTests;
import com.chencs.entity.Log;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Date;

/**
 * @author: chencs
 * @date: 2018/6/7
 */
public class RedisTemplateTest extends ApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test() {
        redisTemplate.opsForValue().set("log", new Log("127.0.0.1", "/hello", "hello", "", "", 12, new Date()));

        Log log = (Log) redisTemplate.opsForValue().get("log");
    }

}
