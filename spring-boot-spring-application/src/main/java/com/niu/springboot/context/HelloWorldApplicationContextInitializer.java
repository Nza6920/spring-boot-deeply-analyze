package com.niu.springboot.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @Description: HelloWorldApplicationContextInitializer
 * @Author nza
 * @Date 2020/1/12
 **/
@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloWorldApplicationContextInitializer<C extends ConfigurableApplicationContext> implements ApplicationContextInitializer<C> {
    @Override
    public void initialize(C applicationContext) {
        System.out.println("HelloWorldApplicationContextInitializer ConfigurableApplicationContext.id() = " + applicationContext.getId());
    }
}
