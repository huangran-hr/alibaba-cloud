package com.hr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaCloudProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(AlibabaCloudProviderApplication.class, args);
    }
}
