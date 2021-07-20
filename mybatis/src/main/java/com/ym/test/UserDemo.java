package com.ym.test;

import com.ym.pojo.User;
import com.ym.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;



import java.util.List;

/**
 * @title: UserDemo
 * @Author Tan
 * @Date: 2021/6/9 16:47
 * @Version 1.0
 */
public class UserDemo {
    public static void main(String[] args) {
       //执行查询
         UserDemo.select();

        //执行新增
       // insert(new User(null,"zhangxueyou","张学友","123456","1"));

        //执行更新
       //update(new User(25,"秦可卿","123456"));

        //删除
        //delete(26);

    }
    //查询
    public static void select(){
        //获取会话对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行sql 参数：命名空间+id
        List<User> list = sqlSession.selectList("mappers.UserMapper.queryAll");

        //遍历
        for(User user :list){
            System.out.println(user.getLoginName()+"---"+user.getUserName());
        }
        //关闭资源
        MybatisUtils.close(sqlSession);
    }

    //新增
    public static void insert(User user){
        //获取会话对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行sql
        sqlSession.insert("mappers.UserMapper.insertOne",user);
        //关闭资源
        MybatisUtils.close(sqlSession);
    }
    //更新
    public static void update(User user){
        //获取会话对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行sql
        sqlSession.update("mappers.UserMapper.updateOne",user);
        //关闭资源
        MybatisUtils.close(sqlSession);
    }

    //删除
    public static void delete(int id){
        //获取会话对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行
        sqlSession.delete("mappers.UserMapper.deleteOne",id);
        //关闭资源
        MybatisUtils.close(sqlSession);
    }

}
