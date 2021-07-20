package com.jy.ym.test;

import com.jy.ym.dao.PersonDao;
import com.jy.ym.daoimpl.PersonDaoImple;
import com.jy.ym.utils.InvocationHandlerUtils;

import java.lang.reflect.Proxy;

/**
 * @title: PersonDaoImpleProxy
 * @Author Tan
 * @Date: 2021/6/21 15:59
 * @Version 1.0
 */
public class PersonDaoImpleProxy {
    public static void main(String[] args) {
        //创建要被代理的对象
        PersonDao personDao = new PersonDaoImple();
        //调用代理的工具类生成代理对象
        InvocationHandlerUtils ihu = new InvocationHandlerUtils(personDao);
        //调用代理的方法
        PersonDao pd = (PersonDao)Proxy.newProxyInstance(personDao.getClass().getClassLoader(),personDao.getClass().getInterfaces(),ihu);
        //调用方法
        pd.getPerson();
    }


}
