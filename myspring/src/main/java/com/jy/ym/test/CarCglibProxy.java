package com.jy.ym.test;

import com.jy.ym.pojo.Car;
import com.jy.ym.utils.MethodInterceptorUtils;
import net.sf.cglib.proxy.Enhancer;

/**
 * @title: CarCglibProxy
 * @Author Tan
 * @Date: 2021/6/21 16:57
 * @Version 1.0
 */
public class CarCglibProxy {
    public static void main(String[] args) {
        //定义要被代理的类的对象
        Car car = new Car();
        //调用工具类生成代理对象
        MethodInterceptorUtils miu = new MethodInterceptorUtils(car);
        //调用代理的方法
        Car newCar =(Car) Enhancer.create(car.getClass(), miu);
        //调方法
        newCar.getCar();
    }

}
