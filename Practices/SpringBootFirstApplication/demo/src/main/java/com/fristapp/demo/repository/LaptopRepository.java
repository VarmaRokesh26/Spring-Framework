package com.fristapp.demo.repository;

import org.springframework.stereotype.Repository;

import com.fristapp.demo.model.Laptop;

@Repository
public class LaptopRepository {

    public void save(Laptop lap) {
        System.out.println("Saved in Databse..");
    }
}
