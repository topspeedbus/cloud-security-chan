package com.chan.changateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableZuulProxy
@EnableFeignClients(basePackages= {"com.chan.changateway.feignclient"})
public class ChanGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChanGatewayApplication.class, args);
    }

}

