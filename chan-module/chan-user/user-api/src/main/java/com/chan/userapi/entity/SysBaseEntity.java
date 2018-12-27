package com.chan.userapi.entity;

import lombok.Data;

import java.util.Date;

/**
 * @version 1.0
 * @auther chan
 * @Date 2018/12/26 14:29
 */
@Data
public class SysBaseEntity {
    private Date createTime;
    private Date updateTime;
    private String delFlag;
}
