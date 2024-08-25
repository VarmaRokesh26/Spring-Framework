package com.fristapp.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fristapp.demo.model.Laptop;
import com.fristapp.demo.repository.LaptopRepository;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository reps;
    public void addLaptop(Laptop lap) {
       reps.save(lap);
    }

    public boolean isGoodFroProgramming(Laptop lap) {
        return true;
    }
}
