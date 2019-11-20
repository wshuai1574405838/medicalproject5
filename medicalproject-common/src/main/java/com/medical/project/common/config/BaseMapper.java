package com.medical.project.common.config;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/*
* 通用基础mapper
*/
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
