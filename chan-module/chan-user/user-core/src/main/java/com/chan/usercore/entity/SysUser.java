package com.chan.usercore.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class SysUser {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Integer userId;
  private String username;
  private String password;
  private String salt;
  private String phone;
  private String avatar;
  private Integer deptId;
  private Date createTime;
  private Date updateTime;
  private Integer lockFlag;
  private Integer delFlag;
  private String wxOpenid;
  private String qqOpenid;

}
