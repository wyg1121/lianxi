package com.offcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

//服务发现
@EnableDiscoveryClient
//本服务启动后会自动注册进eureka服务中
@EnableEurekaClient
@MapperScan(basePackages = "com.offcn.mapper")
@SpringBootApplication
public class Dept8002_Application {
    public static void main(String[] args) {
        SpringApplication.run(Dept8002_Application.class, args);
    }

}
