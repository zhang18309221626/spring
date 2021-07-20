package com.ym.interface_mappers;

import com.ym.pojo.Student;
import com.ym.pojo.User;

import java.util.ArrayList;

public interface UserMapper1 {
    //查询所有的用户信息并返回list集合
    public abstract ArrayList<User> queryAll();
    //根据id查询用户名
    public abstract User queryUserName(int id);
    //根据登录名和用户名查询id
    public abstract User queryId(String userName,String loginName);

    //添加数据
    public abstract void insertStudent(Student student);

}
