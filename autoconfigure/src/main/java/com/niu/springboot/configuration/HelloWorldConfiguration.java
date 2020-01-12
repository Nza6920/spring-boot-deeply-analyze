package com.niu.springboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: 配置
 * @Author nza
 * @Date 2020/1/11
 **/
@Configuration
public class HelloWorldConfiguration {
    @Bean(value = "helloWorld")
    public String helloWorld() {
        return "Hello, World 2020";
    }
}
