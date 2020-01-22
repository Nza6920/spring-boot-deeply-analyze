package com.niu.springboot.web.controller;

import com.niu.springboot.web.domain.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: {@link RestController} UserRestController
 * @Author nza
 * @Date 2020/1/21
 **/
@RestController
public class UserRestController {

    @PostMapping("/echo/user")
    public User user(@RequestBody User user) {
        return user;
    }
}
