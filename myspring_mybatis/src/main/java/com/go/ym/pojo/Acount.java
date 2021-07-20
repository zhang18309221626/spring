package com.go.ym.pojo;

/**
 * @title: Acount
 * @Author Tan
 * @Date: 2021/6/22 10:54
 * @Version 1.0
 */
public class Acount {
    private int id;
    private String name;
    private double money;

    public Acount() {
    }

    public Acount(int id, String name, double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Acount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }


}
