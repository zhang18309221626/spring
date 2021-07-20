package com.ym.controller;

import com.ym.pojo.Student;
import com.ym.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @title: StudentController
 * @Author Tan
 * @Date: 2021/6/28 16:31
 * @Version 1.0
 */
@Controller
@RequestMapping("student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @RequestMapping("selectStudent")
    @ResponseBody
    public Student selectStudent(Integer id){

        return studentService.checkStudent(id);
    }

   @RequestMapping("getAll")
   @ResponseBody
   public List<Student> getAll(){
       return studentService.getAll();
   }

   @RequestMapping("getStudent")
   @ResponseBody
   public String getStudent(@RequestBody Student student){
        studentService.getStudent(student);
       return"go";
   }

   @RequestMapping("updateStudent")
   @ResponseBody
   public String updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
       return"go";
   }

   @RequestMapping("deleteStudent")
   @ResponseBody
   public String deleteStudent(Integer id){
        studentService.deleteStudent(id);
        return "go";
   }

   @RequestMapping("go")
   public ModelAndView go( ModelAndView m){
       m.setViewName("StudentShow");
       return m;
   }
}
