package com.offcn.mapper;

import com.offcn.pojo.Dept;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;


/*
    Mapper接口：基本的增、删、改、查方法
    MySqlMapper：针对MySQL的额外补充接口，支持批量插入
*/
public interface DeptMapper extends Mapper<Dept>,MySqlMapper<Dept> {
}