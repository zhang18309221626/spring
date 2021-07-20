package com.jy.ym.utils;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @title: MethodInterceptorUtils
 * @Author Tan
 * @Date: 2021/6/21 16:37
 * @Version 1.0
 */
public class MethodInterceptorUtils implements MethodInterceptor {
    //定义要被代理的类
    private Object target;

    //带参构造
    public MethodInterceptorUtils(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object result = null;
        //给getCar方法增加日志
        if("getCar".equals(method.getName())){
            result = method.invoke(target,objects);
            System.out.println("日志记录");
        }
        return result;
    }
}
