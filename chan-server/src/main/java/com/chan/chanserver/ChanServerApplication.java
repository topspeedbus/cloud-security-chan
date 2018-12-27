package com.chan.chanserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ChanServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChanServerApplication.class, args);
    }

}

