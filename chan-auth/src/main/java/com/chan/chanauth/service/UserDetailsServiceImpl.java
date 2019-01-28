package com.chan.chanauth.service;

import com.chan.chanauth.detail.UserDetailsImpl;
import com.chan.chanauth.feiclient.SysUserClient;
import com.chan.userapi.entity.SysUser;
import com.chan.userapi.vo.UserVO;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @auther chan
 * @Date 2018/12/25 17:10
 */
@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Resource
    private SysUserClient sysUserClient;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserVO user = sysUserClient.getUserInfoByUserName(username);
        if (null == user) {
            throw new RuntimeException("没有该用户！！");
        }
        return new UserDetailsImpl(user);
    }
}
