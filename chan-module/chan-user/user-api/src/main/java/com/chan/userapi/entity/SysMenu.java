package com.chan.userapi.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class SysMenu extends SysBaseEntity{

  @Id
  @Column(name = "menu_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer menuId;
  private String name;
  private String permission;
  private String path;
  private String url;
  private String method;
  private Integer parentId;
  private String icon;
  private String component;
  private Integer sort;
  private String type;
}
