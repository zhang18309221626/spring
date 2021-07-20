package com.ym.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.ym.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @title: HelloController
 * @Author Tan
 * @Date: 2021/6/22 21:28
 * @Version 1.0
 */
@Controller
public class HelloController {
    public static final String FILE_SERVICE_URL = "http://192.168.10.5:9000/springmvc/upload/";
    //绑定访问的url
    @RequestMapping("hello")
    public ModelAndView hello(){
        //得到modelandview对象
        ModelAndView mav = new ModelAndView();
        //设置数据模型
        mav.addObject("hello","hello SpringMVC");
        //设置视图(找叫做hello的jsp)
        mav.setViewName("hello");
        return mav;
    }

    //超链接传值
    @RequestMapping("findAccount")
    public String findAccount(Integer accountId,String accountName){

        System.out.println("查询了账户："+accountId+"---"+accountName);
        return "";
    }

    //表单传bean、集合/string转date
    @RequestMapping("updateAccount")
    public String updateAccount(Student s){
        System.out.println("更新了账户:"+"-----"+s);
        return "";
    }

    //requestParam注解
    @RequestMapping("param")
    public String param(@RequestParam("name")String username,@RequestParam(value = "age",required = false) Integer age){
        System.out.println(username+"---"+age);
        return "";
    }

    @RequestMapping("body")
    public String body(@RequestBody String body){
        System.out.println(body);
        return "";
    }

    @RequestMapping("studentPathVariable/{id}")
    public String studentPathVariable(@PathVariable("id")Integer id){
        System.out.println(id);
        return "";
    }

    @ModelAttribute
    public Student showModle(String sname){
        //模拟查询数据库
        Student s = findStudentByName(sname);
        System.out.println("执行了showModle方法："+s);
        return s;
    }

    @RequestMapping("updateStudent")
    public String updateStudent(Student student){
        System.out.println("执行了updateStudent的方法："+student);
        return "";
    }


    public Student findStudentByName(String sname){
        Student s= new Student();
        s.setSid(1);
        s.setSname(sname);
        s.setSsex("女");
        return s;
    }

    @RequestMapping("fileUpload")
    public String fileUpload(Student s, MultipartFile pic, HttpServletRequest request) throws IOException {
        System.out.println(s);
        String fileName = UUID.randomUUID().toString()+pic.getOriginalFilename();
        String realPath = request.getServletContext().getRealPath("/images");
        File file = new File(realPath);
        if(!file.exists()){
            file.mkdir();
        }
        //使用 MulitpartFile 接口中方法，把上传的文件写到指定位置
        pic.transferTo(new File(file,fileName));
        System.out.println(file);
        return "";
    }

    @RequestMapping("doFileUpload")
    public String doFileUpload(Student s, MultipartFile pic) throws IOException {
        System.out.println(s);
        String fileName = UUID.randomUUID().toString()+pic.getOriginalFilename();
        String dest = FILE_SERVICE_URL+fileName;
        Client client = Client.create();
        WebResource resource = client.resource(dest);
        String put = resource.put(String.class, pic.getBytes());
        System.out.println(put);
        return "";
    }
}
