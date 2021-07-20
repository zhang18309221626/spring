package com.jy.ym.serviceimpl;

import com.jy.ym.dao.PersonDao;
import com.jy.ym.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @title: PersonServiceImple
 * @Author Tan
 * @Date: 2021/6/18 10:54
 * @Version 1.0
 */
@Service
public class PersonServiceImple implements PersonService {
   // @Resource(name = "personDao")
    @Autowired
    @Qualifier("personDao")
   private PersonDao personDao;


    public void checkPerson() {
        System.out.println("----checkPerson----");
        personDao.getPerson();
    }
}
