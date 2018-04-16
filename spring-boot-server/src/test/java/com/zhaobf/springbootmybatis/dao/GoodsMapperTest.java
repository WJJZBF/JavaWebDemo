package com.zhaobf.springbootmybatis.dao;

import com.zhaobf.springbootmybatis.model.Goods;
import com.zhaobf.springbootmybatis.SpringbootMybatisApplicationTests;
import org.junit.Test;

public class GoodsMapperTest  extends SpringbootMybatisApplicationTests{
    @Test
    public void insert() throws Exception {
        Goods goods = new Goods();
        goods.setId(1);
        goods.setName("青菜");
    }

}