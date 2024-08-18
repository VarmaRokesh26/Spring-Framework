package com.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("prototype")
public class Laptop implements Computer{

    public Laptop() {
        System.out.println("Laptop Object Created");
    }

    @Override
    public void compile() {
        System.out.println("Compiling the program in laptop...");
    }
}
