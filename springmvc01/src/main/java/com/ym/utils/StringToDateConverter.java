package com.ym.utils;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @title: StringToDateConverter
 * @Author Tan
 * @Date: 2021/6/23 18:04
 * @Version 1.0
 */
public class StringToDateConverter implements Converter<String, Date> {
    /**
     * 把string类型转换为date类型
     */
    @Override
    public Date convert(String source) {
        DateFormat format = null;
        try{
            //判断数据不为空
            if(StringUtils.isEmpty(source)){
                throw new NullPointerException("请输入要转换的日期");
            }
            format = new SimpleDateFormat("yyyy-MM-dd");
            //格式化日期
            Date date = format.parse(source);
            //返回
            return date;
        }catch (Exception e){
            throw new RuntimeException("输入的日期有误");
        }
    }
}
