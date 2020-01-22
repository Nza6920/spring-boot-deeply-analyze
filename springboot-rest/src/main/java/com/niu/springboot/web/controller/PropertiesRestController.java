package com.niu.springboot.web.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

/**
 * @Description: PropertiesRestController
 * @Author nza
 * @Date 2020/1/22
 **/
@RestController
public class PropertiesRestController {

    @PostMapping(value = "/add/props",
                consumes = "text/properties;charset=UTF-8", // 过滤媒体类型
                produces = "text/properties;charset=UTF-8")
    public Properties addProperties(@RequestBody Properties properties) {
        return properties;
    }
}
