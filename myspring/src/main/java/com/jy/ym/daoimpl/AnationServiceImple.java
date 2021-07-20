package com.jy.ym.daoimpl;

import com.jy.ym.dao.AnationService;
import org.springframework.stereotype.Repository;

/**
 * @title: AnationServiceImple
 * @Author Tan
 * @Date: 2021/6/21 23:12
 * @Version 1.0
 */
@Repository("anationService")
public class AnationServiceImple implements AnationService {
    @Override
    public void select() {
        System.out.println("---查询---");
    }

    @Override
    public void update() {
        System.out.println("---更新---");
    }

    @Override
    public void insert() {
        System.out.println("---新增---");
    }

    @Override
    public void delete() {
        System.out.println("---删除---");
    }
}
