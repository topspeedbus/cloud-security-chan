package com.chan.userapi.vo;


import com.chan.userapi.entity.SysRole;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @version 1.0
 * @auther chan
 * @Date 2019/1/2 15:26
 */
@Data
public class UserVO implements Serializable {
    private static final long serialVersionUID = -2145082077439934372L;
    /**
     * 主键ID
     */
    private Integer userId;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 随机盐
     */
    private String salt;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 0-正常，1-删除
     */
    private Integer delFlag;
    /**
     * 简介
     */
    private String phone;
    /**
     * 头像
     */
    private String avatar;

    /**
     * 部门ID
     */
    private Integer deptId;
    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 角色列表
     */
    private List<SysRole> roleList;
}

