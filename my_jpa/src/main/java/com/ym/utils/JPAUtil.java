package com.ym.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @title: JPAUtil
 * @Author Tan
 * @Date: 2021/7/13 12:04
 * @Version 1.0
 */
public class JPAUtil {
    //定义JPA的实体管理工厂
    private static EntityManagerFactory em;
    //静态代码块创建对象
    static{
        em = Persistence.createEntityManagerFactory("myJpa");
    }

    //使用工厂产生对象的方法
    public static EntityManager getEntityManager(){
        return em.createEntityManager();
    }
}
