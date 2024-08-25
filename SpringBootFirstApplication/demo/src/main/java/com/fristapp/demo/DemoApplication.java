package com.fristapp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.fristapp.demo.model.Laptop;
import com.fristapp.demo.service.LaptopService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		LaptopService service = context.getBean(LaptopService.class);
		Laptop laptop = context.getBean(Laptop.class);
		service.addLaptop(laptop);

		// Alien al = context.getBean(Alien.class);
		// al.code();
		// System.out.println("Age : " + al.getAge());
	}

}
