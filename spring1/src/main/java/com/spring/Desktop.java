package com.spring;

public class Desktop implements Computer{

    @Override
    public void compile() {
        System.out.println("Compiling the program in Desktop");
    }

}
