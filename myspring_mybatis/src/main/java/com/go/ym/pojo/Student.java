package com.go.ym.pojo;

/**
 * @title: Student
 * @Author Tan
 * @Date: 2021/6/17 15:55
 * @Version 1.0
 */
public class Student {
    private Integer sid;
    private String sname;
    private String ssex;
    private String sbirthday;

    public Student() {
    }

    public Student(Integer sid, String sname, String ssex, String sbirthday) {
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

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getSbirthday() {
        return sbirthday;
    }

    public void setSbirthday(String sbirthday) {
        this.sbirthday = sbirthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", ssex='" + ssex + '\'' +
                ", sbirthday='" + sbirthday + '\'' +
                '}';
    }
}
