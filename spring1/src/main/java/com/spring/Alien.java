package com.spring;

public class Alien {

    private int age;
    private Laptop laptop;

    public Alien() {
        System.out.println("Alien Object Created");
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
