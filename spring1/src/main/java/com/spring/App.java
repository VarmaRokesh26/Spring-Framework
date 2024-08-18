package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    @SuppressWarnings("resource")
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj1 = context.getBean("alien", Alien.class);
        System.out.println(obj1.getAge());
        obj1.code();

        Computer computer = context.getBean(Desktop.class);
        computer.compile();
        Desktop desk = context.getBean(Desktop.class);
        desk.compile();

    }
}
