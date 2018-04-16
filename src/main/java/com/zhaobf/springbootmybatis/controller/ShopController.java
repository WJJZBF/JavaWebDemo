package com.zhaobf.springbootmybatis.controller;

import com.zhaobf.springbootmybatis.controller.param.DeleteParam;
import com.zhaobf.springbootmybatis.controller.param.ShopParam;
import com.zhaobf.springbootmybatis.model.Shop;
import com.zhaobf.springbootmybatis.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URLDecoder;
import java.util.List;

@RestController
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    ShopService shopService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<Object> add(@RequestParam("name") String name) {
        Shop shop = shopService.add(name);
        return ResponseEntity.ok().body(shop);
    }

    @RequestMapping(value = "/add2", method = RequestMethod.POST)
    public ResponseEntity<Object> add(@RequestBody ShopParam param) {
        Shop shop = shopService.add(param.getName());
        return ResponseEntity.ok().body(shop);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public ResponseEntity delete(Integer id) {
        shopService.delete(id);
        return ResponseEntity.ok().body(id);
    }

    @RequestMapping(value = "/delete2", method = RequestMethod.DELETE)
    public ResponseEntity delete(@RequestBody DeleteParam param) {
        shopService.delete(param.getId());
        return ResponseEntity.ok().body(new Result());
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity getAll() {
        List<Shop> list = shopService.getAll();
        Result<List<Shop>> result = new Result<>();
        result.setData(list);

        return ResponseEntity.ok().body(result);
    }

}
