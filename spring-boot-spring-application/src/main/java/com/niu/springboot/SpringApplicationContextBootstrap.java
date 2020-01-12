package com.niu.springboot;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Description: SpringApplicationContextBootstrap
 * @Author nza
 * @Date 2020/1/12
 **/
public class SpringApplicationContextBootstrap {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new SpringApplicationBuilder(SpringApplicationContextBootstrap.class)
                                                        .run(args);

        System.out.println("ConfigurableApplicationContext 类型: " + context.getClass().getName());

        // 关闭上下文
        context.close();
    }
}
