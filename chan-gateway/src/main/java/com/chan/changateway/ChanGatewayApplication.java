package com.chan.changateway;


import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
//@EnableFeignClients(basePackages= {"com.chan.changateway.feignclient"})
public class ChanGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChanGatewayApplication.class, args);
    }
}