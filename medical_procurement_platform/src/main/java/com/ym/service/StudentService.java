package com.ym.service;

import com.ym.pojo.Student;

import java.util.List;

/**
 * @title: StudentService
 * @Author Tan
 * @Date: 2021/6/28 16:29
 * @Version 1.0
 */
public interface StudentService {
    public Student checkStudent(Integer id);

    public List<Student> getAll();

    public void getStudent(Student student);

    public void updateStudent(Student student);

    public void deleteStudent(Integer id);
}
