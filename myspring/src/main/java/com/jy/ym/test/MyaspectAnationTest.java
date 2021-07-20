package com.jy.ym.test;

import com.jy.ym.aop.MyaspectAnation;
import com.jy.ym.dao.AnationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @title: MyaspectAnationTest
 * @Author Tan
 * @Date: 2021/6/21 22:24
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class MyaspectAnationTest {
    @Resource(name = "anationService")
    AnationService as;
    @Test
    public void test(){
        as.select();
        System.out.println("*************");
        as.update();
        System.out.println("*************");
        as.insert();
        System.out.println("*************");
        as.delete();
    }
}
