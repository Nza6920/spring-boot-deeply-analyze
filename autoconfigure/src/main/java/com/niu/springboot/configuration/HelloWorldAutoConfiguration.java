package com.niu.springboot.configuration;

import com.niu.springboot.annotation.EnableHelloWorld;
import com.niu.springboot.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: HelloWorld 自动装配
 * @Author nza
 * @Date 2020/1/11
 **/
@Configuration      // spring 模式注解装配
@EnableHelloWorld   // 模块装配
@ConditionalOnSystemProperty(name = "user.name", value = "Administrator")  // 条件装配
public class HelloWorldAutoConfiguration {
}
