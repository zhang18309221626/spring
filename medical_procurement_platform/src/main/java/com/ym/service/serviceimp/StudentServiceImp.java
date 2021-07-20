package com.ym.service.serviceimp;

import com.ym.dao.StudentDao;
import com.ym.pojo.Student;
import com.ym.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @title: StudentServiceImp
 * @Author Tan
 * @Date: 2021/6/28 16:30
 * @Version 1.0
 */
@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    StudentDao studentDao;
    @Override
    public Student checkStudent(Integer id) {
        return studentDao.selectStudentById(id);
    }

    //查询所有学生
    public List<Student> getAll() {
        return studentDao.findAll();
    }

   //新增学生
    public void getStudent(Student student) {
        studentDao.addStudent(student);
    }

    //修改学生信息
    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

    //删除学生信息
    public void deleteStudent(Integer id) {
        studentDao.deleteStudent(id);
    }
}
