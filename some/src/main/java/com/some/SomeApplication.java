package com.some;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class SomeApplication {

    @Value("${my.message")
    private String message;
    @RequestMapping(value="/getSome")
    public String getSome(){
        return message;
    }

    public static void main(String[] args) {
        SpringApplication.run(SomeApplication.class);
    }
}
