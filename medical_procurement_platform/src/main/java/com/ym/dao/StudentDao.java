package com.ym.dao;

import com.ym.pojo.Student;

import java.util.List;

/**
 * @title: StudentDao
 * @Author Tan
 * @Date: 2021/6/28 16:28
 * @Version 1.0
 */
public interface StudentDao {
    //根据id查学生信息
    public Student selectStudentById(Integer id);
    //查询所有学生的信息
    public List<Student> findAll();
    //添加学生
    public void addStudent(Student student);
    //修改学生信息
    public void updateStudent(Student student);
    //删除学生信息
    public void deleteStudent(Integer id);
}
