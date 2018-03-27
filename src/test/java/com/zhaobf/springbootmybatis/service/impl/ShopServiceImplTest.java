package com.zhaobf.springbootmybatis.service.impl;

import com.alibaba.fastjson.JSON;
import com.zhaobf.springbootmybatis.SpringbootMybatisApplicationTests;
import com.zhaobf.springbootmybatis.model.Shop;
import com.zhaobf.springbootmybatis.service.ShopService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class ShopServiceImplTest  extends SpringbootMybatisApplicationTests{
    @Autowired
    ShopService shopService;
    @Test
    public void add()   {
        Shop shop = shopService.add("沃尔马1");

        System.out.println(JSON.toJSONString(shop));

    }

}