package com.yccg.ym.test;

import com.yccg.ym.interface_mappers.DeptMapper;
import com.yccg.ym.pojo.Dept;
import com.yccg.ym.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;

/**
 * @title: DeptMapperTest
 * @Author Tan
 * @Date: 2021/6/15 22:30
 * @Version 1.0
 */
public class DeptMapperTest {
    public static void main(String[] args) {
        //获取会话对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //获取接口实现类对象
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        //调用方法
        ArrayList<Dept> allDept = mapper.getAllDept();
        //遍历
        for(Dept dept:allDept){
            System.out.println(dept);
        }
       /* ArrayList<Dept> allDept2 = mapper.getAllDept2();
        //遍历
        for(Dept dept:allDept2){
            System.out.println(dept);
        }*/

    }
}
