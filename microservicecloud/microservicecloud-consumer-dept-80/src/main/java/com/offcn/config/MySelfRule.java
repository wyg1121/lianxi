package com.offcn.config;


import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//负载规则配置类
@Configuration
public class MySelfRule {

    @Bean
    //IClientConfig config   参数
    public IRule ribbonRule(){
        //Ribbon默认是轮询，我自定义为随机
        return new RandomRule();
    }
}
