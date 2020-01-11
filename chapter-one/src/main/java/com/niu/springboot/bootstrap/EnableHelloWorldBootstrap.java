package com.niu.springboot.bootstrap;

import com.niu.springboot.annotation.EnableHelloWorld;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Description: 模块装配
 * @Author nza
 * @Date 2020/1/11
 **/
@EnableHelloWorld
public class EnableHelloWorldBootstrap {

    public static void main(String[] args) {
        // 开启上下文, 排除web容器
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableHelloWorldBootstrap.class)
                                                    .web(WebApplicationType.NONE)
                                                    .run(args);

        // hello World Bean 是否存在
        String helloWorld = context.getBean("helloWorld", String.class);
        String helloWorld2 = context.getBean("helloWorld2", String.class);

        System.out.println(helloWorld + " and " + helloWorld2);

        // 关闭上下文
        context.close();
    }
}
