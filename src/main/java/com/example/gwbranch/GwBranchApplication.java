package com.example.gwbranch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GwBranchApplication {

    public static void main(String[] args) {
        SpringApplication.run(GwBranchApplication.class, args);
    }
}
