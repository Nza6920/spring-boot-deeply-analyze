package com.niu.springboot.annotation;

import java.lang.annotation.*;

/**
 * @Description: 派生性, 层次性
 * @Author nza
 * @Date 2020/1/11
 **/
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@FirstLevelRepository
public @interface SecondLevelRepository {
    String value() default "";
}
