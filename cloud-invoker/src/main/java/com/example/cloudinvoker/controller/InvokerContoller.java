package com.example.cloudinvoker.controller;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * InvokerContoller
 *
 * @author 10905 2018/12/18
 * @version 1.0
 */
@RestController
@Configuration
public class InvokerContoller {

    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
    @RequestMapping(value = "/router",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public String router(){
        RestTemplate restTemplate=getRestTemplate();
        String json=restTemplate.getForObject("http://cloud-provider/person/888",String.class);
        return  json;
    }
}
