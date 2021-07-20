package com.ym.test;

import com.ym.entity.Student;
import com.ym.utils.JPAUtil;
import org.junit.Test;

import javax.persistence.*;
import java.util.List;

/**
 * @title: StudentTest
 * @Author Tan
 * @Date: 2021/7/13 11:42
 * @Version 1.0
 */
public class StudentTest {
    @Test
    public void test() {
        //创建实体管理类工厂
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("myJpa");
        //创建实体管理类
        EntityManager em = factory.createEntityManager();
        //获取事务对象
        EntityTransaction et = em.getTransaction();
        //开启事务
        et.begin();
        //创建对象
        Student s = new Student();
        s.setSname("林青霞");
        s.setSsex("女");
        s.setSaddress("清风路108号");
        //保存操作
        em.persist(s);
        //提交事务
        et.commit();
        //释放资源
        em.close();
        factory.close();


    }

    @Test
    //新增
    public void add() {
        //创建对象
        Student s = new Student("梦可儿", "女", "天星路111号");
        EntityManager em = null;
        EntityTransaction tx = null;
        try {
            //创建jpa实体对象
            em = JPAUtil.getEntityManager();
            //获取事务
            tx = em.getTransaction();
            //开启事务
            tx.begin();
            //执行操作
            em.persist(s);
            //提交事务
            tx.commit();
        } catch (Exception e) {
            //事务回滚
            tx.rollback();
            e.printStackTrace();
        } finally {
            //释放资源
            em.close();
        }
    }

    @Test
    //修改
    public void update(){
        EntityManager em = null;
        EntityTransaction tx = null;
        try{
            //创建jpa实体对象
            em = JPAUtil.getEntityManager();
            //获取事务
           tx =  em.getTransaction();
           //开启事务
            tx.begin();
            //根据id查询
            Student s = em.find(Student.class, 2);
            s.setSaddress("天华路109号");
            //把s对象从缓存中清除出去
            em.clear();
            //执行操作
            em.merge(s);
            //提交事务
            tx.commit();


        }catch(Exception e){
            //事务回滚
            tx.rollback();
            e.printStackTrace();
        } finally {
            //释放资源
            em.close();
        }
    }

    @Test
    //删除
    public void remove(){
        EntityManager em = null;
        EntityTransaction tx = null;
        try{
            //创建实体对象
            em = JPAUtil.getEntityManager();
            //获得事务对象
            tx = em.getTransaction();
            //开启事务
            tx.begin();
            //根据id查询
            Student s = em.find(Student.class, 3);
            //执行删除操作
            em.remove(s);
            //提交事务
            tx.commit();

        }catch (Exception e){
            //事务回滚
            tx.rollback();
            e.printStackTrace();
        }finally {
            //释放资源
            em.close();
        }
    }

    @Test
    //查询全部
    public void findAll(){
        EntityManager em = null;
        EntityTransaction tx = null;
        try {
            //创建实体对象
            em = JPAUtil.getEntityManager();
            //获得事务对象
            tx = em.getTransaction();
            //开启事务
            tx.begin();
            //创建query对象
            String jpql = "from Student";
            //执行全部查询并返回结果
            Query query = em.createQuery(jpql);
            List list = query.getResultList();
            for(Object obj:list){
                System.out.println(obj);
            }
            //事务提交
            tx.commit();

        }catch (Exception e){
            //事务回滚
            tx.rollback();
            e.printStackTrace();
        }finally {
            //释放资源
            em.close();
        }
    }
}
