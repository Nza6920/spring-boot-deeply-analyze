package com.niu.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.Executors;

/**
 * @Description: 通知
 * @Author nza
 * @Date 2020/1/17
 **/
@ControllerAdvice(assignableTypes = HelloWorldController.class)
public class HelloWorldControllerAdvice {

    @ModelAttribute("acceptLanguage")
    public String acceptLanguage(@RequestHeader("Accept-Language") String acceptLanguage) {
        return acceptLanguage;
    }

    @ModelAttribute("jsessionId")
    public String jsessionId(@CookieValue("JSESSIONID") String jsessionId) {
        return jsessionId;
    }

    @ModelAttribute("message")
    public String message() {
        return "Hello World";
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> onException(Exception ex) {
        return ResponseEntity.ok(ex.getMessage());
    }
}
