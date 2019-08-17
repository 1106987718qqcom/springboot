package com.example.springboot_day01.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test01 {
    @GetMapping("/test")
    public String test(){
        System.out.println("a");
        return "test";
    }
}

