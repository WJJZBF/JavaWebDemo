package com.zhaobf.springbootmybatis.controller;

;

/**
 * @author wujiaojiao
 * @create 2018-03-27 下午10:41
 **/
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;

    public Result() {
        this.code = 0;
        this.msg = "成功";
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
