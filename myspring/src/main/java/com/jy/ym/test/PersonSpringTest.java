package com.jy.ym.test;

import com.jy.ym.pojo.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @title: PersonSpringTest
 * @Author Tan
 * @Date: 2021/6/16 20:41
 * @Version 1.0
 */
//创建容器
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class PersonSpringTest {
    @Test
    public void test(){
        //记载核心配置文件
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext1.xml");
        //Person person = (Person)app.getBean("person");
        Person person = (Person)app.getBean("person");
        System.out.println(person);

    }
}
