package com.niu.springboot.web.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description: spring boot 视图引导类
 * @Author nza
 * @Date 2020/1/19
 **/
@SpringBootApplication
@ComponentScan("com.niu.springboot.web")
public class SpringBootViewBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootViewBootstrap.class, args);
    }

}
