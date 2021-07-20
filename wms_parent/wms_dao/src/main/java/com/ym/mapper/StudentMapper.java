package com.ym.mapper;

import com.ym.pojo.Student;

/**
 * @title: StudentMapper
 * @Author Tan
 * @Date: 2021/7/1 15:13
 * @Version 1.0
 */
public interface StudentMapper {
    //根据id查学生
    public abstract Student selectStudentById(int id);
}
