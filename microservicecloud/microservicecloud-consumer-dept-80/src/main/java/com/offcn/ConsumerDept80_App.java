package com.offcn;

import com.offcn.config.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;


//开启负载均衡策略
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MySelfRule.class)

//5.2.4主程序入口开启ribbon
@EnableEurekaClient

//服务发现Eureka
@EnableDiscoveryClient

@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})

@SpringBootApplication
public class ConsumerDept80_App {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerDept80_App.class, args);
    }

}
