package com.netshell.libraries.microservices.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NetshellRegistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(NetshellRegistryApplication.class, args);
    }
}
