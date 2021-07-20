package com.yccg.ym.pojo;

import java.util.ArrayList;

/**
 * @title: Dept
 * @Author Tan
 * @Date: 2021/6/15 20:48
 * @Version 1.0
 */
public class Dept {
    private Integer deptid;
    private String dname;
    private String dloc;
    private ArrayList<User> emps;

    public Integer getId() {
        return deptid;
    }

    public void setId(Integer id) {
        this.deptid = id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDloc() {
        return dloc;
    }

    public void setDloc(String dloc) {
        this.dloc = dloc;
    }

    public ArrayList<User> getEmps() {
        return emps;
    }

    public void setEmps(ArrayList<User> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        return "Dept [deptid=" + deptid + ", dname=" + dname + ", dloc=" + dloc + ", emps=" + emps + "]";
    }
}
