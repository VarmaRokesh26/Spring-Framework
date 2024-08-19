package com.fristapp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.fristapp.demo.model.Alien;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		Alien al = context.getBean(Alien.class);
		al.code();
		System.out.println("Age : " + al.getAge());
	}

}
