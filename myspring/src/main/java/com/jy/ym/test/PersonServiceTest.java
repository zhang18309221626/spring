package com.jy.ym.test;

import com.jy.ym.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @title: PersonServiceTest
 * @Author Tan
 * @Date: 2021/6/18 10:56
 * @Version 1.0
 */
public class PersonServiceTest {

    public static void main(String[] args) {
        //加载spring核心配置文件
        ApplicationContext app =  new ClassPathXmlApplicationContext("applicationContext1.xml");
        PersonService ps = (PersonService) app.getBean("personServiceImple");
        ps.checkPerson();
    }
}
