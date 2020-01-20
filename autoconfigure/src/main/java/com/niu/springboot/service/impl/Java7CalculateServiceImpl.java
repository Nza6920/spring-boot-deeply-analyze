package com.niu.springboot.service.impl;

import com.niu.springboot.service.CalculateService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


/**
 * @Description: JAVA7 循环实现
 * @Author nza
 * @Date 2020/1/11
 **/
@Profile("Java7")
@Service(value = "java7CalculateService")
public class Java7CalculateServiceImpl implements CalculateService {
    @Override
    public Integer sum(Integer... value) {

        System.out.println("version: Java7");
        int sum = 0;
        for (Integer val : value) {
            sum += val;
        }
        return sum;
    }
}
