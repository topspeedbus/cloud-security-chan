package com.chan.common.utils;

import lombok.Data;

import java.io.Serializable;

/**
 * @version 1.0
 * @auther chan
 * @Date 2018/12/26 15:52
 */
@Data
public class WebR<T> implements Serializable {
    private static final long serialVersionUID = -6370999705025234994L;

    private static final int SUCCESS = 1;
    private static final int FIAL = 0;
    private int code = SUCCESS;
    private String msg = "success";
    private T data;

    public WebR() {
    }

    public WebR(T data) {
        this.data = data;
    }

    public WebR(Throwable e) {
        this.code = FIAL;
        this.msg = e.getMessage();
    }

    public WebR(T data, String msg) {
        this.data = data;
        this.msg = msg;
    }

    public WebR(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 用于删除更新等操作时，只需返回状态即可
     *
     * @return WebR
     */
    public static <T> WebR<T> success() {
        return new WebR<>();
    }

    /**
     * 简单成功返回
     *
     * @param data 返回的数据
     * @return WebR
     */
    public static <T> WebR<T> success(T data) {
        return new WebR<>(data);
    }

    /**
     * 带提示的成功返回
     *
     * @param msg  返回的提示信息
     * @param data 返回的数据
     * @return WebR
     */
    public static <T> WebR<T> success(T data, String msg) {
        return new WebR<>(data, msg);
    }

    /**
     * 发生异常时返回
     *
     * @param e 异常对象
     * @return WebR
     */
    public static <T> WebR<T> error(Throwable e) {
        return new WebR<>(e);
    }

    /**
     * 带自定义状态码的失败返回
     *
     * @param code 自定义的状态码
     * @param msg  返回的提示信息
     * @return WebR
     */
    public static <T> WebR<T> error(int code, String msg) {
        return new WebR<>(code, msg);
    }
}
