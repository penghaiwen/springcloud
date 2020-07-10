package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.**"})
@EnableDiscoveryClient
@EnableFeignClients
public class RunAdmin {
    public static void main(String[] args) {
        SpringApplication.run(RunAdmin.class);
    }
}
