package com.ym.controller;

import com.ym.pojo.Student;
import com.ym.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @title: StudentController
 * @Author Tan
 * @Date: 2021/7/1 16:00
 * @Version 1.0
 */
@Controller
@RequestMapping("studentController")
public class StudentController {
    @Autowired
    StudentService studentService;
    @RequestMapping("getStudent")
    @ResponseBody
    public Student getStudent(){
        return studentService.checkStudent(1);
    }
}
