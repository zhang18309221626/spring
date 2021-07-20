package com.yccg.ym.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @title: MybatisUtils
 * @Author Tan
 * @Date: 2021/6/10 10:08
 * @Version 1.0
 */
public class MybatisUtils {
    //定义成员变量
    private static SqlSessionFactory sqlSessionFactory =null;
    //静态代码块
    static{
        try {
            //加载配置文件
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            //创建sql会话工厂
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //获得sqlsession的方法
    public static SqlSession getSqlSession(){
        //参数true为自动提交,false为不自动提交
        return sqlSessionFactory.openSession(true);
    }

    //关闭资源的方法
    public static void close(SqlSession session ){
        //判断不为空后关闭资源
        if(session!=null){
            session.close();
        }
    }
}
