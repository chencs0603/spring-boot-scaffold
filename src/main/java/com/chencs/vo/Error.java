package com.chencs.vo;

/**
 * 错误码枚举
 *
 * @author: chencs
 * @date: 2018/4/27
 */
public enum Error {
    OK(0, "成功"),

    UNKNOWN_REASON(2000, "未知错误，请联系管理员")
    ;

    private int code;
    private String message;

    Error(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
