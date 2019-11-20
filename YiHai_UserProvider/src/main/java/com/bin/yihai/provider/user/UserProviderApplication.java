package com.bin.yihai.provider.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.bin.yihai.provider.user.dao")
public class UserProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserProviderApplication.class, args);
    }
}
