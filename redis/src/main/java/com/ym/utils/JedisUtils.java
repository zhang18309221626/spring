package com.ym.utils;

import redis.clients.jedis.Jedis;

/**
 * @title: JedisUtils
 * @Author Tan
 * @Date: 2021/7/2 13:58
 * @Version 1.0
 */
public class JedisUtils {
    public static void main(String[] args) {
        //获取连接
        Jedis jedis = new Jedis("localhost",6379);
        jedis.set("username","zhangsan");
        System.out.println(jedis.get("username"));
    }
}
