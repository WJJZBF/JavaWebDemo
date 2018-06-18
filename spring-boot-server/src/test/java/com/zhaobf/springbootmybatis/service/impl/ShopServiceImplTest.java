package com.zhaobf.springbootmybatis.service.impl;

import com.alibaba.fastjson.JSON;
import com.zhaobf.springbootmybatis.model.Shop;
import com.zhaobf.springbootmybatis.service.ShopService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ShopServiceImplTest {
    @Autowired
    ShopService shopService;

    @Test
    public void add() {
        Shop shop = shopService.add("沃尔马5");

        System.out.println(JSON.toJSONString(shop));

    }

    @Test
    public void delete() {
        shopService.delete(8);
    }

//    @Test
//    public void getAll() {
//        List<Shop> all = shopService.getAll();
//        System.out.println(JSON.toJSONString(all));
//    }

}