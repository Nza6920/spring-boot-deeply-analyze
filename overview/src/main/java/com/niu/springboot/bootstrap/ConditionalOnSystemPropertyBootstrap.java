package com.niu.springboot.bootstrap;

import com.niu.springboot.condition.ConditionalOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @Description: 条件装配 - condition
 * @Author nza
 * @Date 2020/1/11
 **/
public class ConditionalOnSystemPropertyBootstrap {

    @Bean
    @ConditionalOnSystemProperty(name = "user.name", value = "Administrator")
    public String helloWorld() {
        return "hello Administration";
    }

    public static void main(String[] args) {
        // 开启上下文, 排除web容器
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionalOnSystemPropertyBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        String helloWorld = context.getBean("helloWorld", String.class);
        System.out.println(helloWorld);

        // 关闭上下文
        context.close();
    }
}
