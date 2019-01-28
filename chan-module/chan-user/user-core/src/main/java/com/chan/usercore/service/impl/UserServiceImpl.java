package com.chan.usercore.service.impl;

import com.chan.userapi.vo.UserVO;
import com.chan.usercore.mapper.SysUserMapper;
import com.chan.usercore.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @auther chan
 * @Date 2018/12/26 14:50
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    private SysUserMapper userMapper;

    @Override
    public UserVO getUserInfoByName(String userName) {
        return userMapper.selectUserVoByUserName(userName);
    }
}