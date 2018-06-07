package com.chencs.dao;

import com.chencs.entity.Log;

import java.util.List;

/**
 * 日志Dao接口
 *
 * @author chencs
 * @since 2018/5/4
 */
public interface LogDao {

    void save(Log log);

    List<Log> queryList(int offset, int pageSize);

    Log queryOne(Long id);

}
