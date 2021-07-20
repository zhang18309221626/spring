package com.jy.ym.utils;

import javax.xml.transform.Result;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @title: InvocationHandlerUtils
 * @Author Tan
 * @Date: 2021/6/21 15:44
 * @Version 1.0
 */
public class InvocationHandlerUtils implements InvocationHandler {
    //定义要被代理的类
    private Object target;

    //带参构造
    public InvocationHandlerUtils(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
      /*  //判断方法名是否相同(给某个方法加日志)
        if ("select".equals(method.getName())) {
            //增加日志记录
            System.out.println("日志记录");
            result = method.invoke(target, args);
        }*/
        //给全部方法加日志
        System.out.println("日志记录");
        result = method.invoke(target, args);
        return result;
    }
}
