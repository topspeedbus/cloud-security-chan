package com.chan.chanauth;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients(basePackages = "com.chan.chanauth.feiclient")
public class ChanAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(ChanAuthApplication.class, args);
    }
}

