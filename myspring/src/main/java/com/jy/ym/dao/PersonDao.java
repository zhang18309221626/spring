package com.jy.ym.dao;

public interface PersonDao {
    public void getPerson();

    //新增
    public void insert();

    //更新
    public void update();

    //查询
    public PersonDao select(int id);

    //删除
    public void delete(int id);
}
