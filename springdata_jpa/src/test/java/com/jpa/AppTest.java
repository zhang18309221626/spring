package com.jpa;

import static org.junit.Assert.assertTrue;

import com.jpa.dao.UserDao;
import com.jpa.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.criteria.*;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AppTest {
    @Autowired
    UserDao userDao;

    @Test
    public void test() {
        List<User> list = userDao.findAllUser();
        for (User user : list) {
            System.out.println(user);
        }
    }

    @Test
    public void test1() {
        User user = userDao.findOne(new Specification<User>() {
            @Override
            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Path<String> path = root.get("uname");
                Predicate like = criteriaBuilder.like(path, "张%");
                return like;
            }
        });

        System.out.println(user);


    }
}
