package com.niu.springboot.web.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: {@link RestController} HelloWorldRestController
 * @Author nza
 * @Date 2020/1/21
 **/
@RestController
public class HelloWorldRestController {

    @GetMapping(value = "/hello-world")
    public String helloWorld(@RequestParam(required = false) String message) {
        return "Hello World!" + message;
    }

    @CrossOrigin("*")
    @GetMapping(value = "/hello")
    public String hello() {
        return "hello";
    }
}
