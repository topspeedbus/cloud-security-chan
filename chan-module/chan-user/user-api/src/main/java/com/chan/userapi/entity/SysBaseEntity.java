package com.chan.userapi.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @version 1.0
 * @auther chan
 * @Date 2018/12/26 14:29
 */
@Data
public class SysBaseEntity implements Serializable {
    private Date createTime;
    private Date updateTime;
    private Integer delFlag;
}
