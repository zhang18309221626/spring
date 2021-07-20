package com.yccg.ym.interface_mappers;

import com.yccg.ym.pojo.IdCard;

/**
 * @title: IdCardMapper
 * @Author Tan
 * @Date: 2021/6/15 21:05
 * @Version 1.0
 */
public interface IdCardMapper {
    public abstract IdCard selectCodeById(int id);
}
