package com.go.ym.mapper;

import com.go.ym.pojo.Student;

/**
 * @title: StudentMapper
 * @Author Tan
 * @Date: 2021/6/17 16:16
 * @Version 1.0
 */
public interface StudentMapper {
    //根据id查询学生
    public Student findStudentById(int id);
}
