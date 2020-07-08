package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {



    @GetMapping("get/orderDetails/{id}")
    public Map<String,Object> getOrderDetails(@PathVariable("id") Long id){
        System.out.println("调用order服务");
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("id",id);
        map.put("name","商品名称");
        map.put("price",1000);
        return map;
    }
}
