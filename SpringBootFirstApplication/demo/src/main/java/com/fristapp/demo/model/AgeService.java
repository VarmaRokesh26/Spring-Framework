package com.fristapp.demo.model;

import org.springframework.stereotype.Component;

@Component("ageservice")
public class AgeService {

    public int giveAge() {
        return 25;
    }
}
