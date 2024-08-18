package com.spring;

public class Alien {

    private int age;

    public Alien() {
        System.out.println("Alien Object Created");
    }

    public void setAge(int age) {
        System.out.println("Setter Called");
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void code() {
        System.out.println("Coding");
    }
}
