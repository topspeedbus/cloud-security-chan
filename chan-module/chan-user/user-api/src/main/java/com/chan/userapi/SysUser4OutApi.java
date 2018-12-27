package com.chan.userapi;

/**
 * @version 1.0
 * @auther chan
 * @Date 2018/12/26 17:19
 */
public interface SysUser4OutApi {
    /**
     * 该模块在注册中心得调用地址
     */
    String PROVIDER_ADDRESS = "USER-CORE";

    /**
     * 根据用户名查询用户信息
     */
    String GET_USERINFO_BY_USERNAME = "admin/user/{userName}";
    String GET_USERINFO_BY_USERNAME_METHOD = "get";

}
