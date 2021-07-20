package com.jy.ym.pojo;

import java.util.*;

/**
 * @title: Collection
 * @Author Tan
 * @Date: 2021/6/17 11:15
 * @Version 1.0
 */
public class Collection {
    private Object[] array;
    private List<Object> list;
    private ArrayList<Object> list1;
    private Map<Object,Object> map;
    Properties properties;

    public Collection() {
    }

    public Collection(Object[] array, List<Object> list, ArrayList<Object> list1, Map<Object, Object> map, Properties properties) {
        this.array = array;
        this.list = list;
        this.list1 = list1;
        this.map = map;
        this.properties = properties;
    }

    public Object[] getArray() {
        return array;
    }

    public void setArray(Object[] array) {
        this.array = array;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public ArrayList<Object> getList1() {
        return list1;
    }

    public void setList1(ArrayList<Object> list1) {
        this.list1 = list1;
    }

    public Map<Object, Object> getMap() {
        return map;
    }

    public void setMap(Map<Object, Object> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "array=" + Arrays.toString(array) +
                ", list=" + list +
                ", list1=" + list1 +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
