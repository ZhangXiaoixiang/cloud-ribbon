package com.example.cloudinvoker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * InvokerContoller
 * 使用自己的AIP测试
 * @author 10905 2018/12/18
 * @version 1.0
 */
@RestController
@Configuration
public class RibbonContoller {

@Autowired
    private LoadBalancerClient loadBalancerClient;

@RequestMapping(value = "/load",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ServiceInstance load(){
    System.out.println("Ribbon自己的API----------------");
//    查找服务
    ServiceInstance serviceInstance=loadBalancerClient.choose("cloud-provider");
    System.out.println(serviceInstance.getUri()+"/person/909");
    return serviceInstance;
}
    @RequestMapping(value = "/loadTest",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public String loadTest() throws URISyntaxException {
        System.out.println("Ribbon自己的API----------------");
//    查找服务
        ServiceInstance serviceInstance=loadBalancerClient.choose("cloud-provider");
        URI uri=new URI(serviceInstance.getUri()+"/person/915");
         RestTemplate restTemplate = new RestTemplate();
        final String s = restTemplate.getForObject(uri.toString(), String.class);
        System.out.println(uri);
        return s;
    }

}
