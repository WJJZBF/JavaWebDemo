package com.zhaobf.springbootmybatis.dao;

import com.zhaobf.springbootmybatis.model.Shop;
import com.zhaobf.springbootmybatis.SpringbootMybatisApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class ShopMapperTest extends SpringbootMybatisApplicationTests {

    @Autowired
    ShopMapper shopMapper;

    @Test
    public void insert()  {
        Shop shop = new Shop();
//        shop.setId(1);
        shop.setName("物美");
        shop.setCreateTime(new Date());
        shop.setUpdateTime(new Date());

        int insert = shopMapper.insert(shop);
        Assert.assertTrue(insert > 0);
        System.out.println(insert);
    }


    @Test
    public void contextLoads() {
        System.out.println("");
    }

}