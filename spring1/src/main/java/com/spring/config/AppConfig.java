package com.spring.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.spring.Alien;
import com.spring.Computer;
import com.spring.Desktop;
import com.spring.Laptop;

@Configuration
public class AppConfig {

    
    @Bean
    // Even though the dektop() bean is set to primary the name referred by the 
    // qualifier is given the top priority when two beans are defined with the same interface
    public Alien alien(@Qualifier("laptop") Computer computer) {
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
