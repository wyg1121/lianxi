package com.offcn.service.impl;

import com.offcn.mapper.DeptMapper;
import com.offcn.pojo.Dept;
import com.offcn.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public void add(Dept dept) {
        deptMapper.insert(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Dept> list() {
        return deptMapper.selectAll();
    }
}