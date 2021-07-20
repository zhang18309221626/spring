package com.jy.ym.daoimpl;

import com.jy.ym.dao.OrderService;

/**
 * @title: OrderServiceImple
 * @Author Tan
 * @Date: 2021/6/21 20:18
 * @Version 1.0
 */
public class OrderServiceImple implements OrderService {
    @Override
    public void select() {
        System.out.println("----查询订单---");
    }

    @Override
    public void update() {
        System.out.println("----修改订单---");
    }

    @Override
    public void insert() {
        System.out.println("----新增订单---");
    }

    @Override
    public void delete() {
        System.out.println("----删除订单---");
    }
}
