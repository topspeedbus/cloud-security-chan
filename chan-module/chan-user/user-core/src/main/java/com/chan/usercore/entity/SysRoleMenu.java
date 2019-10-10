package com.chan.usercore.entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
//@Entity
public class SysRoleMenu {

  private Integer roleId;
  private Integer menuId;

}
