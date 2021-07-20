package com.yccg.ym.test;

import com.yccg.ym.interface_mappers.UserMapper;
import com.yccg.ym.pojo.User;
import com.yccg.ym.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * @title: UserMapperTest
 * @Author Tan
 * @Date: 2021/6/15 21:23
 * @Version 1.0
 */
public class UserMapperTest {
    public static void main(String[] args) {
        //获取会话对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //获取接口的实现类对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //调用方法
       /* User user = mapper.selectUserById3(4);
        System.out.println(user);*/
        /*User user = mapper.selectUserById1(4);
        System.out.println(user);*/
        User user = mapper.selectUserById2(4);
        System.out.println(user);
    }
}
