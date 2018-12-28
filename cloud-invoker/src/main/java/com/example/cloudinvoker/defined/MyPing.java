package com.example.cloudinvoker.defined;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.Server;

/**
 * MyPing
 *
 * @author 10905 2018/12/28
 * @version 1.0
 */
public class MyPing implements IPing {
    @Override
    public boolean isAlive(Server server) {
        System.out.println("这是自定义PING类,服务输出信息是:"+server.getHostPort());
        return true;
    }
}
