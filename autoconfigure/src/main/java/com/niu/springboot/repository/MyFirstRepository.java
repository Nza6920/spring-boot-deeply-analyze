package com.niu.springboot.repository;

import com.niu.springboot.annotation.SecondLevelRepository;

/**
 * @Description: 我的
 * @Author nza
 * @Date 2020/1/11
 **/
//@FirstLevelRepository(value = "myFirstRepository")
@SecondLevelRepository(value = "myFirstRepository")
//@Component(value = "myFirstRepository")
public class MyFirstRepository {

    public MyFirstRepository() {
        this.name = "admin";
    }

    public MyFirstRepository(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyFirstRepository{" +
                "name='" + name + '\'' +
                '}';
    }
}
