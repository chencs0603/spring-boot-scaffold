package com.chencs.vo;

import lombok.Data;

/**
 * 客户端与服务器的统一数据交换格式
 *
 * @author: chencs
 * @date: 2018/4/27
 */
@Data
public class ResultBean<T> {

    private int errorCode;
    private String errorMsg;

    private T data;

    public ResultBean(Error error) {
        this.errorCode = error.getCode();
        this.errorMsg = error.getMessage();
    }

    public ResultBean(T data) {
        this(Error.OK);
        this.data = data;
    }

}
