package com.ym.service.impl;

import com.ym.mapper.StudentMapper;
import com.ym.pojo.Student;
import com.ym.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @title: StudentServiceImpl
 * @Author Tan
 * @Date: 2021/7/1 15:57
 * @Version 1.0
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;
    public Student checkStudent(int id) {
        return studentMapper.selectStudentById(id);
    }
}
