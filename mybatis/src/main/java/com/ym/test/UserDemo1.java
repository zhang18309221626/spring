package com.ym.test;

import com.ym.interface_mappers.UserMapper1;
import com.ym.pojo.Student;
import com.ym.pojo.User;
import com.ym.utils.MybatisUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;

/**
 * @title: UserDemo1
 * @Author Tan
 * @Date: 2021/6/10 20:20
 * @Version 1.0
 */
public class UserDemo1 {
    public static void main(String[] args) {
     /*   //获取会话对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //获取接口的实现类对象
        UserMapper1 mapper = sqlSession.getMapper(UserMapper1.class);
        //无参查询
        ArrayList<User> list = mapper.queryAll();
        //遍历
        for(User user:list){
            System.out.println(user.getLoginName()+"--"+user.getUserName());
        }

        //带一个参数查询
        User user = mapper.queryUserName(25);
        System.out.println(user.getUserName());

        //带多个参数查询
        User user1 = mapper.queryId("李光亮", "liguangliang");
        System.out.println(user1.getId());*/

        //获取会话对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //获取接口的实现类对象
        UserMapper1 mapper = sqlSession.getMapper(UserMapper1.class);

        //调用增加的方法
        mapper.insertStudent(new Student(null,"云韵",0,"1999-9-19"));
        //关闭资源
        sqlSession.close();
    }
}
