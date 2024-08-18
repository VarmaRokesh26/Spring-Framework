package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.spring.Desktop;

@Configuration
public class AppConfig {

    // @Bean(name = {"com2", "deskptop1", "mine"})
    @Bean
    @Scope("prototype")
    public Desktop desktop() {
        return new Desktop();
    }
}
