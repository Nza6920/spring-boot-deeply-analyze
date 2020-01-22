package com.niu.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: {@link RestController} HelloWorldController
 * @Author nza
 * @Date 2020/1/21
 **/
@Controller
public class HelloWorldController {

    @GetMapping(value = "/index")
    public String index() {
        return "index";
    }
}
