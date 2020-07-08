package org.example.controller;

import org.example.controller.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class TestController {

    @Resource
    private OrderService orderService;

    @GetMapping("get/order/{id}")
    public Map<String,Object> getOrderDetails(@PathVariable("id") Long id){
        System.out.println("调用admin服务");
        Map<String,Object> map = orderService.getOrderDetailsById(id);
        return map;
    }
}
