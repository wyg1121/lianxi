package com.offcn.controller;

import com.offcn.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerDiscoveryController {

    @Autowired
    private DiscoveryClient client;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping(value="/dept/dis/add")
    public boolean add(@RequestBody Dept dept){
        List<ServiceInstance> serverList = client.getInstances("MICROSERVICECLOUD-DEPT");
        serverList.get(0).getUri();
        return true;

    }

    @GetMapping(value="/dept/dis/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        List<ServiceInstance> serverList = client.getInstances("MICROSERVICECLOUD-DEPT");
        return restTemplate.getForObject(serverList.get(0).getUri()+"/dept/get/"+id,Dept.class);
    }

    @GetMapping(value="/dept/dis/list")
    public List<Dept> list(){

        List<ServiceInstance> serviceInstanceList = client.getInstances("MICROSERVICECLOUD-DEPT");
        for(ServiceInstance si:serviceInstanceList){
            System.out.println(si.getUri());
        }
        return restTemplate.getForObject(serviceInstanceList.get(0).getUri()+"/dept/list",List.class);
    }



}
