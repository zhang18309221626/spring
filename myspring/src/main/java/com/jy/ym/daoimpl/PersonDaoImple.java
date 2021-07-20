package com.jy.ym.daoimpl;

import com.jy.ym.dao.PersonDao;
import org.springframework.stereotype.Repository;

/**
 * @title: PersonDaoImple
 * @Author Tan
 * @Date: 2021/6/18 10:52
 * @Version 1.0
 */
@Repository("personDao")
public class PersonDaoImple implements PersonDao {

    public void getPerson() {
        System.out.println("-----getPerson--------");
    }

    @Override
    public void insert() {

    }

    @Override
    public void update() {

    }

    @Override
    public PersonDao select(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
