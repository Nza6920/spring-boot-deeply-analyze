package com.niu.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: HelloWorldController
 * @Author nza
 * @Date 2020/1/19
 **/
@Controller
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "hello-world";  // view 逻辑名称
    }

    @RequestMapping("")
    public String index() {
        return "index";
    }

    @ModelAttribute(name = "message")
    public String message() {
        return "Hello, World";
    }
}
