package com.yuqipu.TimeLine.service.impl;

public class ResultJson<T> {
    private int code;
    private T data;
//    data这里如果什么也不设置的话，前端就会得到一个null
    /**
     * 操作成功
     */
    public static final ResultJson SUCCESS_RESULT = new ResultJson(500);
    /**
     * 系统异常
     */
    public static final ResultJson SYSTEM_ERROR_RESULT = new ResultJson(501);
    /**
     * 登录异常
     */
    public static final ResultJson LOGIN_ERROR_RESULT = new ResultJson(502);
    /**
     * 请求参数异常
     */
    public static final ResultJson PARAM_ERROR_RESULT = new ResultJson(503);
    /**
     * 操作失败
     */
    public static final ResultJson FAIL_RESULT = new ResultJson(504);

    /**
     * 默认错误编码
     */
    public static final int ERROR = 9;

    public ResultJson() {
    }

    public ResultJson(T data) {
        this.code = ResultJson.SUCCESS_RESULT.getCode();
        this.data = data;
    }

    public ResultJson(int code) {
        this.code = code;
    }

    public ResultJson(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public ResultJson(ResultJson param, T data) {
        this.code = param.getCode();
        this.data = data;
    }

    public static <T> ResultJson<T> error() {
        return (ResultJson<T>) new ResultJson(ERROR);
    }

    public static <T> ResultJson<T> data(T data) {
        return (ResultJson<T>) new ResultJson(SUCCESS_RESULT, data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    
}
