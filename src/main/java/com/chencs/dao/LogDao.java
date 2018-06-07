package com.chencs.dao;

import com.chencs.entity.Log;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * 日志Dao接口
 *
 * @author chencs
 * @since 2018/5/4
 */
@CacheConfig(cacheNames = "logs", keyGenerator = "wiselyKeyGenerator")
public interface LogDao {

    @CachePut
    void save(Log log);

    @Cacheable
    List<Log> queryList(int offset, int pageSize);

    @Cacheable
    Log queryOne(long id);

}
