package com.chan.usercore.utils;

import tk.mybatis.mapper.additional.idlist.DeleteByIdListMapper;
import tk.mybatis.mapper.additional.idlist.SelectByIdListMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @version 1.0
 * @auther chan
 * @Date 2018/12/26 10:06
 */
public interface UserTkMapper<T> extends Mapper<T>, MySqlMapper<T>, DeleteByIdListMapper<T, Integer>, SelectByIdListMapper<T, Integer> {

}
