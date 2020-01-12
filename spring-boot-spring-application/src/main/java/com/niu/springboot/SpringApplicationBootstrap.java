package com.niu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashSet;
import java.util.Set;

/**
 * springApplication 引导类
 */
public class SpringApplicationBootstrap {

    public static void main(String[] args) {
//        SpringApplication.run(SpringApplicationBootstrap.class, args);

        // 配置 class 名称
        Set<String> sources = new HashSet<>();
        sources.add(ApplicationConfiguration.class.getName());

        SpringApplication springApplication = new SpringApplication();
        springApplication.setSources(sources);
        springApplication.setWebApplicationType(WebApplicationType.NONE);
        ConfigurableApplicationContext context = springApplication.run(args);

        ApplicationConfiguration bean = context.getBean(ApplicationConfiguration.class);
        System.out.println("Bean: " + bean);
    }

    @SpringBootApplication
    public static class ApplicationConfiguration {

    }
}
