package com.jy.ym.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @title: MyaspectAnation
 * @Author Tan
 * @Date: 2021/6/21 22:01
 * @Version 1.0
 */
//切面类
@Component("myaspectAnation")
@Aspect
public class MyaspectAnation {

    @Pointcut("execution(* com.jy.ym.daoimpl.AnationServiceImple.*(..))")
    public void p1(){
    }

    //前置通知
    @Before("p1()")
    public void before(){
        System.out.println("---前置通知---");
    }

    //后置通知
    @AfterReturning("p1()")
    public void afterReturning(){
        System.out.println("---后置通知----");
    }

    //环绕通知
    @Around("p1()")
    public void around(ProceedingJoinPoint pj){
        try {
            Object proceed = pj.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("---环绕通知----");
    }
    //异常通知
    @AfterThrowing("p1()")
    public void afterThrowing(){
        System.out.println("---异常抛出通知，方法执行出现异常时执行----");
    }

    //最终通知,类似于finally，肯定会执行
    @After("p1()")
    public void after(){
        System.out.println("---最终通知----");
    }

}
