package com.example.springsecurityjwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

public class SpringSecurityJwtTokenApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJwtTokenApplication.class, args);
    }

}
