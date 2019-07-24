package com.zhengdianfang.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {

    private String username;

    private int age;

    private String address;

    public String getUsername() {
        return username;
    }

    @Value("${com.user.name}")
    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public int getAge() {
        return age;
    }

    @Value("${com.user.age}")
    public User setAge(int age) {
        this.age = age;
        return this;
    }

    public String getAddress() {
        return address;
    }

    @Value("${com.user.address}")
    public User setAddress(String address) {
        this.address = address;
        return this;
    }
}
