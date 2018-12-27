package com.chan.userapi.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class SysUser extends SysBaseEntity{
  @Id
  @Column(name = "user_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer userId;
  private String username;
  private String password;
  private String salt;
  private String phone;
  private String avatar;
  private Integer deptId;
}
