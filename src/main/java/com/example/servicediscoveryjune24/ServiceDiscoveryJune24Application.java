package com.example.servicediscoveryjune24;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryJune24Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscoveryJune24Application.class, args);
    }

}
