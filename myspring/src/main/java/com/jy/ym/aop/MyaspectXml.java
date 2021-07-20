package com.jy.ym.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @title: MyaspectXml
 * @Author Tan
 * @Date: 2021/6/21 20:35
 * @Version 1.0
 */
public class MyaspectXml {
    //前置增强
    public void before(){
        System.out.println("----前置通知----");
    }

    //后置增强
    public void afterReturing(){
        System.out.println("----后置通知----");
    }

    //环绕增强
    public void around(ProceedingJoinPoint pj){
        try {
            Object proceed = pj.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("----环绕通知----");
    }

    //最终增强
    public void after(){
        System.out.println("----最终通知----");
    }
}
