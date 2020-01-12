package com.niu.springboot.service;

/**
 * @Description: 计算服务
 * @Author nza
 * @Date 2020/1/11
 **/
public interface CalculateService {
    /**
     * sum 求和
     * @param value
     * @return sum累加值
     */
    Integer sum(Integer... value);
}
