package com.zhaobf.springbootmybatis.dao;

import com.zhaobf.springbootmybatis.model.Goods;
import org.junit.Test;

public class GoodsMapperTest{
    @Test
    public void insert() throws Exception {
        Goods goods = new Goods();
        goods.setId(1);
        goods.setName("青菜");
    }

}