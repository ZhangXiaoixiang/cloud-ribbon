package com.example.cloudinvoker.defined;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * MyRule
 * 自定义负载规则
 *
 * @author 10905 2018/12/28
 * @version 1.0
 */
public class MyRule implements IRule {
    private ILoadBalancer iLoadBalancer;

    @Override
    public Server choose(Object o) {
//        获取所有服务
        List<Server> allServers = iLoadBalancer.getAllServers();
        System.out.println("服务数量:  "+allServers.size());
        System.out.println("这是自定义服务规则类,输出服务信息,定时监测服务状态");
        for (Server allServer : allServers) {
            System.out.println("   " + allServer.getHostPort());
        }
        System.out.println("返回调用的自定义服务======:"+ allServers.get(0));
        return allServers.get(0);
    }

    @Override
    public void setLoadBalancer(ILoadBalancer iLoadBalancer) {
        this.iLoadBalancer = iLoadBalancer;
    }

    @Override
    public ILoadBalancer getLoadBalancer() {
        return this.iLoadBalancer;
    }
}
