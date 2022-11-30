package com.example.Testgit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Testcontroller {

    @GetMapping("/test")
    public static String test(){
        return"hello world";
    }
}
