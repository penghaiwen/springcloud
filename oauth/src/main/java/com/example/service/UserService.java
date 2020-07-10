package com.example.service;

import com.example.security.JwtUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(name = "admin")
public interface UserService {

    @GetMapping("/api/get/user")
    JwtUser getJwtUserByUserName();
}
