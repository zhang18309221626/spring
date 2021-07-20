package com.go.ym.test;

import com.go.ym.mapper.StudentMapper;
import com.go.ym.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @title: StudentMapperTest
 * @Author Tan
 * @Date: 2021/6/17 17:04
 * @Version 1.0
 */
public class StudentMapperTest {
    public static void main(String[] args) {
        //加载spring核心文件
        ApplicationContext app =  new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取student的bean对象
        StudentMapper sm = (StudentMapper)app.getBean("studentMapper");
        //调用方法
        Student s = sm.findStudentById(5);
        System.out.println(s);

    }
}
