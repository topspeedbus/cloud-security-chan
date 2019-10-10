package com.chan.usercore.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "sys_user_role")
public class SysUserRole {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Integer id;
  private Integer userId;
  private Integer roleId;
}
