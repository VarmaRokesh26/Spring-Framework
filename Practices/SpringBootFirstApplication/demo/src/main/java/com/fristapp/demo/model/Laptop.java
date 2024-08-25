package com.fristapp.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{

    @Override
    public void compile() {
        System.out.println("Compiling Code in Laptop..");
    }
}
