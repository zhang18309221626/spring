package com.yccg.ym.interface_mappers;

import com.yccg.ym.pojo.User;

import java.util.ArrayList;

/**
 * @title: UserMapper
 * @Author Tan
 * @Date: 2021/6/15 20:53
 * @Version 1.0
 */
public interface UserMapper {
    public abstract User selectUserById1(int id);
    public abstract User selectUserById2(int id);
    public abstract User selectUserById3(int id);
    //根据部门编号查询该部门下所有员工
    public abstract ArrayList<User> getUserByDeptId(int deptId);
}
