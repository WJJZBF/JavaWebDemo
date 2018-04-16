package com.zhaobf.springbootmybatis.dao;

import com.zhaobf.springbootmybatis.model.Shop;

import java.util.List;

public interface ShopMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shop record);
    List<Shop> getAll();
//    List<Shop> getAll();

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
}