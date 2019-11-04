package com.offcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//EurekaServer服务器端启动类,接受其它微服务注册进来
@EnableEurekaServer
public class Eureka7002_App {

    public static void main(String[] args) {
        SpringApplication.run(Eureka7002_App.class, args);
    }

}
