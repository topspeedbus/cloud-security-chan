package com.chan.usercore.mapper;

import com.chan.userapi.entity.SysUser;
import com.chan.userapi.vo.UserVO;
import com.chan.usercore.utils.UserTkMapper;

/**
 * @version 1.0
 * @auther chan
 * @Date 2018/12/26 10:17
 */
public interface SysUserMapper extends UserTkMapper<SysUser> {
    /**
     * 获取用户和角色信息用户包装userdetail
     * @param userName
     * @return
     */
    UserVO selectUserVoByUserName(String userName);
}
