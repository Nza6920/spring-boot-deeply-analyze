package com.niu.springboot.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @Description: HelloWorldApplicationListener 监听 ContextRefreshedEvent
 * @Author nza
 * @Date 2020/1/12
 **/
@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloWorldApplicationListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("HelloWorldApplicationListener ContextRefreshedEvent: " + event);
        System.out.println("timestamp: " + event.getTimestamp());
    }
}
