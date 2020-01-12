package com.niu.springboot.annotation;

import com.niu.springboot.configuration.HelloWorldConfiguration;
import com.niu.springboot.configuration.HelloWorldConfiguration2;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Description: 模块装配
 * @Author nza
 * @Date 2020/1/11
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
//@Import({HelloWorldConfiguration.class, HelloWorldConfiguration2.class})
@Import(HelloWorldImportSelector.class)
public @interface EnableHelloWorld {

}
