package com.zhaobf.springbootmybatis.service;

import com.zhaobf.springbootmybatis.model.Shop;

public interface ShopService {
    Shop add(String name );
    void delete(Integer id );
}
