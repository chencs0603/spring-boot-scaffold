package com.chencs.entity;

import lombok.Data;

import java.util.Date;

/**
 * 日志实体
 *
 * @author chencs
 * @since 2018/5/3
 */
@Data
public class Log {

    private Long id;
    private String ip;
    private String url;
    private String method;
    private String params;
    private String result;
    private Integer spendTime;
    private Date createTime;

    public Log() {
    }

    public Log(String ip, String url, String method, String params, String result, Integer spendTime, Date createTime) {
        this.ip = ip;
        this.url = url;
        this.method = method;
        this.params = params;
        this.result = result;
        this.spendTime = spendTime;
        this.createTime = createTime;
    }

}
