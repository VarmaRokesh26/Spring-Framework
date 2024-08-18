package com.fristapp.demo;

import org.springframework.stereotype.Component;

@Component("ageservice")
public class AgeService {

    public int giveAge() {
        return 25;
    }
}
