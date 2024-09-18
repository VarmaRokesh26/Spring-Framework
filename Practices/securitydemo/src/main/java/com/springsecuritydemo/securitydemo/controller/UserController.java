package com.springsecuritydemo.securitydemo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springsecuritydemo.securitydemo.model.User;
import com.springsecuritydemo.securitydemo.service.JWTService;
import com.springsecuritydemo.securitydemo.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    private JWTService jwtService;

    @PostMapping("register")
    public User register(@RequestBody User user) {
        userService.saveUser(user);
        return user;
    }

    @PostMapping("login")
    public String login(@RequestBody User user) {
        Authentication authentication = authenticationManager
                                        .authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));

        if(authentication.isAuthenticated()) 
            return jwtService.generateToken(user.getUsername());
        else return "LOGIN FAILED";
    }
}
