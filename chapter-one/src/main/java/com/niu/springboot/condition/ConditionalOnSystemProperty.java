package com.niu.springboot.condition;

import org.springframework.boot.system.SystemProperties;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @Description: 条件装配 - conditional
 * @Author nza
 * @Date 2020/1/11
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
@Conditional(OnSystemPropertyCondition.class)
public @interface ConditionalOnSystemProperty {

    /**
     * 系统属性的名称
     */
    String name();

    /**
     * Java 系统属性值
     */
    String value();
}
