package com.zhaobf.springbootmybatis.controller;

import com.zhaobf.springbootmybatis.model.Shop;
import com.zhaobf.springbootmybatis.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    ShopService shopService;

    @RequestMapping("/add")
    public ResponseEntity<Object> add(@RequestParam("name") String name) {
        Shop shop = shopService.add(name);
        return ResponseEntity.ok().body(shop);
    }
}
