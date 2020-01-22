package com.niu.springboot.web.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: SpringBootRestBootstrap 引导类
 * @Author nza
 * @Date 2020/1/21
 **/
@SpringBootApplication(scanBasePackages = {"com.niu.springboot.web"})
public class SpringBootRestBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestBootstrap.class, args);
    }
}
