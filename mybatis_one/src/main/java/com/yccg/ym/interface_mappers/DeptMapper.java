package com.yccg.ym.interface_mappers;

import com.yccg.ym.pojo.Dept;

import java.util.ArrayList;

/**
 * @title: DeptMapper
 * @Author Tan
 * @Date: 2021/6/15 22:09
 * @Version 1.0
 */
public interface DeptMapper {
    public abstract ArrayList<Dept> getAllDept();
    public abstract ArrayList<Dept> getAllDept2();
}
