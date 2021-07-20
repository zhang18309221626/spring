package com.jy.ym.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @title: Person
 * @Author Tan
 * @Date: 2021/6/16 20:20
 * @Version 1.0
 */
@Component
public class Person {
    @Value("秦可卿")
    private String name;
    @Value("27")
    private Integer age;
    @Resource
    private Car car;

    public Person() {

    }
    public Person(String name, Integer age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }


    public void init(){
        System.out.println("调用初始化方法");
    }
    public void destroy(){
        System.out.println("调用销毁的方法");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
