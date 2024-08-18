package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.Desktop;

@Configuration
public class AppConfig {

    @Bean
    public Desktop dektop() {
        return new Desktop();
    }
}
