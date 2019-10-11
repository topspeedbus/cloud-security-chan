package com.chan.usercore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringCloudApplication
@EnableFeignClients(basePackages = "com.chan.usercore.feignclient")
@EnableTransactionManagement
//如果需要jar中的entity必须加上包扫描
@EntityScan(basePackages = "com.chan.userapi.entity")
public class UserCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserCoreApplication.class, args);
    }

}

