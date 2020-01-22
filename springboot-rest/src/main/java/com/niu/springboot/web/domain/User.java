package com.niu.springboot.web.domain;

/**
 * @Description: User
 * @Author nza
 * @Date 2020/1/21
 **/
public class User {

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
