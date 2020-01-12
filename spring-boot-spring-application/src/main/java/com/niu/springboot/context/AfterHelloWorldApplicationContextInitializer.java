package com.niu.springboot.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;

/**
 * @Description: AfterHelloWorldApplicationContextInitializer
 * @Author nza
 * @Date 2020/1/12
 **/
public class AfterHelloWorldApplicationContextInitializer<C extends ConfigurableApplicationContext> implements ApplicationContextInitializer<C>, Ordered {
    @Override
    public void initialize(C applicationContext) {
        System.out.println("AfterHelloWorldApplicationContextInitializer ConfigurableApplicationContext.id() = " + applicationContext.getId());
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
