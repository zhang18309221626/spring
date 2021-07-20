package com.ym.entity;

import javax.persistence.*;

/**
 * @title: Student
 * @Author Tan
 * @Date: 2021/7/13 11:20
 * @Version 1.0
 */
//声明实体类
@Entity
//建立实体类和表的映射关系
@Table(name ="s_student")
public class Student {
    @Id//声明为主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//配置主键的生成策略
    @Column(name ="s_id")
    private int sid;
    @Column(name ="s_name")
    private String sname;
    @Column(name ="s_sex")
    private String ssex;
    @Column(name ="s_address")
    private String saddress;

    public Student() {
    }

    public Student( String sname, String ssex, String saddress) {
        this.sname = sname;
        this.ssex = ssex;
        this.saddress = saddress;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", ssex='" + ssex + '\'' +
                ", saddress='" + saddress + '\'' +
                '}';
    }
}
