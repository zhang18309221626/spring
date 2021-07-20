package com.go.ym.service;

import com.go.ym.pojo.Acount;

/**
 * @title: AcountService
 * @Author Tan
 * @Date: 2021/6/22 11:15
 * @Version 1.0
 */
public interface AcountService {
    //根据姓名查账户
    public Acount getAcountByName(String name);
    //转账
    public void transfer(String fromName,String toName,double money);
}
