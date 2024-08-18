package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.AppConfig;

// import org.springframework.context.ApplicationContext;
// import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    @SuppressWarnings("resource")
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop dt = context.getBean(Desktop.class);
        dt.compile();




        // ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // Alien obj1 = context.getBean("alien", Alien.class);
        // System.out.println(obj1.getAge());
        // obj1.code();

        // Computer computer = context.getBean(Computer.class);
        // computer.compile();
        // Desktop desk = context.getBean(Desktop.class);
        // desk.compile();

    }
}
