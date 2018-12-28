package com.example.cloudprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.Scanner;

@SpringBootApplication
@EnableEurekaClient
public class CloudProviderApplication {

    public static void main(String[] args) {
        System.out.println("请输入端口号 8080  还是 8081");
        Scanner scanner=new Scanner(System.in);
        String port = scanner.next();
        new SpringApplicationBuilder(CloudProviderApplication.class).properties("server.port="+port).run(args);
    }

}

