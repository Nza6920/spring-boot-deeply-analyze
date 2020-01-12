package com.niu.springboot.service.impl;

import com.niu.springboot.service.CalculateService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

/**
 * @Description: JAVA8 lambda
 * @Author nza
 * @Date 2020/1/11
 **/
@Profile("Java8")
@Service(value = "java8CalculateService")
public class Java8CalculateServiceImpl implements CalculateService {
    @Override
    public Integer sum(Integer... value) {
        System.out.println("version: Java8");
        return Stream.of(value).reduce(0, Integer::sum);
    }
}
