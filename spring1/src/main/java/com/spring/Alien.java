package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// import java.beans.ConstructorProperties;

@Component
public class Alien {

    private int age;
    
    @Autowired
    @Qualifier("laptop")
    private Computer computer;

    public Alien() {
        System.out.println("Alien Object Created");
    }

    // @ConstructorProperties({"age","laptop"})
    // public Alien(int age, Laptop laptop) {
    //     System.out.println("Parametrized Constructor");
    //     this.age = age;
    //     this.laptop = laptop;
    // }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void code() {
        System.out.println("Coding");
        computer.compile();
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

}
