package com.jy.ym.test;

import com.jy.ym.dao.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @title: SpringAopTest
 * @Author Tan
 * @Date: 2021/6/21 20:23
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")

public class SpringAopTest {
    @Resource(name="orderService")
    public OrderService orderService;
    @Test
    public void test(){
        orderService.select();
        System.out.println("*******************");
        orderService.update();
        System.out.println("*******************");
        orderService.insert();
        System.out.println("*******************");
        orderService.delete();
    }
}
