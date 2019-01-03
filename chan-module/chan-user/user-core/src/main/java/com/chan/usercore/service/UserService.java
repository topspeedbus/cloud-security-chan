package com.chan.usercore.service;

import com.chan.userapi.vo.UserVO;

/**
 * @version 1.0
 * @auther chan
 * @Date 2018/12/26 14:49
 */
public interface UserService {
    /**
     * 根据用户名获取用户信息
     * @param userName
     * @return
     */
    UserVO getUserInfoByName(String userName);
}
