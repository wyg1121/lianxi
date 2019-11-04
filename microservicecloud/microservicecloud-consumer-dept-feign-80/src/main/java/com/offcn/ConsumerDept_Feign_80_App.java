package com.offcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


//5.2.4主程序入口开启ribbon
@EnableEurekaClient

//服务发现Eureka
@EnableDiscoveryClient

@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})

@EnableFeignClients(basePackages = {"com.offcn.service"})

@ComponentScan("com.offcn.controller")


@SpringBootApplication
public class ConsumerDept_Feign_80_App {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDept_Feign_80_App.class, args);
    }

}
