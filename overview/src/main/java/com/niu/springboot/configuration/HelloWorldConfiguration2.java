package com.niu.springboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: 配置
 * @Author nza
 * @Date 2020/1/11
 **/
@Configuration
public class HelloWorldConfiguration2 {
    @Bean(value = "helloWorld2")
    public String helloWorld() {
        return "Hello, World2 2020";
    }
}
