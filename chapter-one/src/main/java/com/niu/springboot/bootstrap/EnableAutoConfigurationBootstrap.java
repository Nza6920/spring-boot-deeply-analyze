package com.niu.springboot.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Description: 自动装配
 * @Author nza
 * @Date 2020/1/11
 **/
@EnableAutoConfiguration
public class EnableAutoConfigurationBootstrap {

    public static void main(String[] args) {
        // 开启上下文, 排除web容器
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableAutoConfigurationBootstrap.class)
                                                    .web(WebApplicationType.NONE)
                                                    .run(args);

        String helloWorld1 = context.getBean("helloWorld", String.class);
        String helloWorld2 = context.getBean("helloWorld2", String.class);

        System.out.println("helloWorld1: " + helloWorld1);
        System.out.println("helloWorld2: " + helloWorld2);

        // 关闭上下文
        context.close();
    }
}
