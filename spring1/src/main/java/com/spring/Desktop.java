package com.spring;

public class Desktop implements Computer{

    public Desktop() {
        System.out.println("Desktop Object is Created");
    }
    
    @Override
    public void compile() {
        System.out.println("Compiling the program in Desktop");
    }

}
