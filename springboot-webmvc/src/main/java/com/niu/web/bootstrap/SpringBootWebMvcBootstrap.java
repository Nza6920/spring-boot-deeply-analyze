package com.niu.web.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: SpringBootWebMvcBootstrap
 * @Author nza
 * @Date 2020/1/17
 **/
@SpringBootApplication(scanBasePackages = "com.niu.web")
public class SpringBootWebMvcBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebMvcBootstrap.class, args);
    }
}
