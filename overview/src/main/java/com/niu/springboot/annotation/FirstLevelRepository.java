package com.niu.springboot.annotation;

import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

/**
 * @Description: 派生性, 层次性
 * @Author nza
 * @Date 2020/1/11
 **/
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repository
public @interface FirstLevelRepository {

    String value() default "";
}
