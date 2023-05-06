package com.example.rabbitmqcustomer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.example.rabbitmqcustomer")
@EnableDiscoveryClient
public class RabbitmqCustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RabbitmqCustomerApplication.class, args);
    }

}
