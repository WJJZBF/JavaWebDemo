package com.zhaobf.springbootmybatis.service;

import com.zhaobf.springbootmybatis.model.Shop;

import java.util.List;

public interface ShopService {
    Shop add(String name );
    void delete(Integer id );
    List<Shop> getAll();
}
