package com.chan.usercore.controller;

import com.chan.userapi.entity.SysUser;
import com.chan.usercore.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @auther chan
 * @Date 2018/12/26 14:48
 */
@RestController
@RequestMapping("admin/user")
public class UserController {
    @Resource
    private UserService userService;

    /**
     * 根据用户名获取用户信息
     */
    @GetMapping("{userName}")
    public SysUser getUserInfoByName(@PathVariable("userName") String userName) {
        return userService.getUserInfoByName(userName);
    }
}
