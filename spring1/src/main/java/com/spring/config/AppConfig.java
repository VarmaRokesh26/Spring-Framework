package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.Primary;

import com.spring.Alien;
import com.spring.Computer;
import com.spring.Desktop;
import com.spring.Laptop;

@Configuration
public class AppConfig {

    
    @Bean
    public Alien alien(Computer computer) {
        Alien obj = new Alien();
        obj.setAge(30);
        obj.setComputer(computer);
        
        return obj;
    }

    // @Bean(name = {"com2", "deskptop1", "mine"})
    @Bean
    @Primary
    // @Scope("prototype")
    public Desktop desktop() {
        return new Desktop();
    }

    @Bean 
    public Laptop laptop() {
        return new Laptop();
    }

}
