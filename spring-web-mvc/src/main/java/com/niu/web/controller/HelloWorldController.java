package com.niu.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description: HelloWorldController
 * @Author nza
 * @Date 2020/1/13
 **/
@Controller
public class HelloWorldController {

    @RequestMapping("")
    public String index(@RequestParam int value) {
        return "index";
    }
}
