package com.springsecuritydemo.securitydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String greet(HttpServletRequest request) {
        return "Hello Welcome";
    }

    @GetMapping("about")
    public String about(HttpServletRequest request) {
        return "About us";
    }
}
 