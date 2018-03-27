package com.zhaobf.springbootmybatis.service.impl;

import com.zhaobf.springbootmybatis.dao.ShopMapper;
import com.zhaobf.springbootmybatis.model.Shop;
import com.zhaobf.springbootmybatis.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    ShopMapper shopMapper;

    @Override
    public Shop add(String name) {
        Shop shop = new Shop();
        shop.setName(name);
        shop.setCreateTime(new Date());
        shop.setUpdateTime(new Date());
        int rows = shopMapper.insert(shop);
        return shop;
    }

    @Override
    public void delete(Integer id) {
      int rows=shopMapper.deleteByPrimaryKey(id);
      System.out.println("受影响的行数"+rows);
    }
}
