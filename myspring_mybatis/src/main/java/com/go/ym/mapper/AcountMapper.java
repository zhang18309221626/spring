package com.go.ym.mapper;

import com.go.ym.pojo.Acount;
import org.springframework.stereotype.Repository;

/**
 * @title: AcountMapper
 * @Author Tan
 * @Date: 2021/6/22 10:56
 * @Version 1.0
 */
public interface AcountMapper {
    //更改账户
    public void updateAcount(Acount acount);
    //根据姓名查找账户
    public Acount findAcountByName(String name);
}
