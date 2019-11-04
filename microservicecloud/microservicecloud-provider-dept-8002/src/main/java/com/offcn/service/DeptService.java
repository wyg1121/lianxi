package com.offcn.service;

import com.offcn.pojo.Dept;

import java.util.List;

public interface DeptService {

    public void add(Dept dept);
    public Dept get(Long id);
    public List<Dept> list();
}
