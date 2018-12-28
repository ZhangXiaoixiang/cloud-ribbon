package com.example.cloudinvoker.config;

import com.example.cloudinvoker.defined.MyPing;
import com.example.cloudinvoker.defined.MyRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;

/**
 * MyConfig
 * 配置类,返回自定义相关类
 * @author 10905 2018/12/28
 * @version 1.0
 */
public class MyConfig {
    @Bean
    public IRule getRule(){
        return new MyRule();
    }
    @Bean
    public IPing getIPing(){
        return  new MyPing();
    }

}
