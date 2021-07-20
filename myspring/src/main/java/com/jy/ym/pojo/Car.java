package com.jy.ym.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @title: Car
 * @Author Tan
 * @Date: 2021/6/17 10:40
 * @Version 1.0
 */
@Component
public class Car {
    @Value("奔驰")
    private  String brand;
    @Value("银色")
    private String color;

    public Car() {
    }

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


    public void getCar(){
        System.out.println("----getCar----");
    }
}
