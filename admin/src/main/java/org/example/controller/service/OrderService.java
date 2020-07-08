package org.example.controller.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@Component
@FeignClient(name = "order")
public interface OrderService {

    @GetMapping("/order/get/orderDetails/{id}")
    Map<String,Object> getOrderDetailsById(@PathVariable("id") Long id);
}
