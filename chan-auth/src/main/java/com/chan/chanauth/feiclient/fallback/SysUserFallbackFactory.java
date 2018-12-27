package com.chan.chanauth.feiclient.fallback;

import com.chan.chanauth.feiclient.SysUserClient;
import com.chan.userapi.entity.SysUser;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;

/**
 * @version 1.0
 * @auther chan
 * @Date 2018/12/26 17:37
 */
@Slf4j
public class SysUserFallbackFactory implements FallbackFactory<SysUserClient> {
    @Override
    public SysUserClient create(Throwable cause) {
        return new SysUserClient() {

            @Override
            public SysUser getUserInfoByUserName(String userName) {
                log.error("auth 调用 getUserInfoByUserName报错，userName：{}, cause：{}", userName,  cause);
                return null;
            }
        };
    }
}
