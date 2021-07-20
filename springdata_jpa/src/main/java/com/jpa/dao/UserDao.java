package com.jpa.dao;

import com.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @title: UserDao
 * @Author Tan
 * @Date: 2021/7/15 14:35
 * @Version 1.0
 */
public interface UserDao  extends JpaRepository<User,Integer>, JpaSpecificationExecutor<User> {
    //使用jpql的方式查询
    @Query(value ="from  User ")
    public List<User> findAllUser();


}
