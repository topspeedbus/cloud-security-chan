package com.chan.chanauth.feiclient;

import com.chan.chanauth.feiclient.fallback.SysUserFallbackFactory;
import com.chan.userapi.SysUser4OutApi;

import com.chan.userapi.vo.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @version 1.0
 * @auther chan
 * @Date 2018/12/26 17:35
 */
@FeignClient(value = SysUser4OutApi.PROVIDER_ADDRESS, fallbackFactory = SysUserFallbackFactory.class)
public interface SysUserClient {

    @GetMapping(SysUser4OutApi.GET_USERINFO_BY_USERNAME)
    UserVO getUserInfoByUserName(@PathVariable("userName") String userName);
}
