package com.niu.springboot;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description: Spring 应用事件
 * @Author nza
 * @Date 2020/1/12
 **/
public class SpringApplicationEventBootstrap {

    public static void main(String[] args) {

        // 创建上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        // 注册应用事件监听器
        context.addApplicationListener((event) -> {
            System.out.println("监听到事件: " + event);
        });

        // 启动上下文
        context.refresh();

        // 发布事件
        context.publishEvent("helloWorld");
        context.publishEvent("helloWorld");
        context.publishEvent(new ApplicationEvent("nza") {

        });

        // 关闭上下文
        context.close();
    }
}
