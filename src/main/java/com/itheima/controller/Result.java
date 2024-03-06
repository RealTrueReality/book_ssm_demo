package com.itheima.controller;

/**
 * @author TrueReality
 * @date 2022/12/28
 * @apiNote
 */
public class Result {
    private Object data;
    private Integer code;
    private String message;

    public Result(Integer code,Object data) {
        this.data = data;
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Result() {
    }

    public Result(Integer code,Object data, String message) {
        this.data = data;
        this.code = code;
        this.message = message;
    }
}
