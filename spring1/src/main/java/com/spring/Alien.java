package com.spring;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private Laptop laptop;

    public Alien() {
        System.out.println("Alien Object Created");
    }

    @ConstructorProperties({"age","laptop"})
    public Alien(int age, Laptop laptop) {
        System.out.println("Parametrized Constructor");
        this.age = age;
        this.laptop = laptop;
    }

    public void setAge(int age) {
        System.out.println("Setter Called for Alien Age");
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void code() {
        System.out.println("Coding");
        laptop.compile();
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

}
