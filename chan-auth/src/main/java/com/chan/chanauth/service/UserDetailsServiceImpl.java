package com.chan.chanauth.service;

import com.chan.chanauth.feiclient.SysUserClient;
import com.chan.userapi.entity.SysUser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @auther chan
 * @Date 2018/12/25 17:10
 */
public class UserDetailsServiceImpl implements UserDetailsService {

    @Resource
    private SysUserClient sysUserClient;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser user = sysUserClient.getUserInfoByUserName(username);
        return null;
    }
}
