package com.jpa.entity;

import javax.persistence.*;

/**
 * @title: User
 * @Author Tan
 * @Date: 2021/7/14 11:51
 * @Version 1.0
 */
//声明实体类
@Entity
//建立实体类和表的映射关系
@Table(name = "u_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "u_uid")
    private Integer uid;
    @Column(name = "u_uname")
    private String uname;
    @Column(name = "u_uage")
    private Integer uage;

    public User() {
    }

    public User(Integer uid, String uname, Integer uage) {
        this.uid = uid;
        this.uname = uname;
        this.uage = uage;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getUage() {
        return uage;
    }

    public void setUage(Integer uage) {
        this.uage = uage;
    }


    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", uage=" + uage +
                '}';
    }
}
