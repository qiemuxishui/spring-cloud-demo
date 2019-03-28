package com.uniware.configservergkyfbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigServerGkyfbsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerGkyfbsApplication.class, args);
    }

}
