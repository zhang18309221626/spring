package com.go.ym.test;

import com.go.ym.service.AcountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @title: AcountTest
 * @Author Tan
 * @Date: 2021/6/22 11:48
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AcountTest {
    @Autowired
    AcountService acountService;

    @Test
    public void test(){
        acountService.transfer("李四","张三",100);
    }
}
