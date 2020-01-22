package com.niu.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Properties;

/**
 * @Description: PropertiesRestController2
 * @Author nza
 * @Date 2020/1/22
 **/
@Controller
public class PropertiesRestController2 {

    @PostMapping(value = "/add/props2",
            consumes = "text/properties;charset=UTF-8") // 过滤媒体类型
    public Properties addProperties(Properties properties) {
        return properties;
    }
}
