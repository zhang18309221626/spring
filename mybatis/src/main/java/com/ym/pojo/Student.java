package com.ym.pojo;

/**
 * @title: Student
 * @Author Tan
 * @Date: 2021/6/11 11:31
 * @Version 1.0
 */
public class Student {
    private Integer sid;
    private String sname;
    private Integer ssex;
    private String sbirthday;

    public Student() {
    }

    public Student(Integer sid, String sname, Integer ssex, String sbirthday) {
        this.sid = sid;
        this.sname = sname;
        this.ssex = ssex;
        this.sbirthday = sbirthday;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSsex() {
        return ssex;
    }

    public void setSsex(Integer ssex) {
        this.ssex = ssex;
    }

    public String getSbirthday() {
        return sbirthday;
    }

    public void setSbirthday(String sbirthday) {
        this.sbirthday = sbirthday;
    }
}
