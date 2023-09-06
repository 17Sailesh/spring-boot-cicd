package com.saileshsoft.springbootcicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerhi {
    @GetMapping("/welcome")
    public String getMessage(){
        return "Welcome to World";
    }
}
