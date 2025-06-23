package com.ramila.RestAPI.controller;

import com.ramila.RestAPI.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class TestController {

    List<User> users = Arrays.asList(
            new User(101, "Ramila"),
            new User(102, "Shisir"),
            new User(103, "Shyam")
    );

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable int id){
        return users.stream().filter(m -> m.getId()== id).findFirst().get();
    }


    @GetMapping("/hello")
    public String hello()
            // create read update delete(CRUD)
    {
        return "Hello World";
    }

    @GetMapping("/")
    public User home(){
        return new User(101, "Ramila");
    }


}
