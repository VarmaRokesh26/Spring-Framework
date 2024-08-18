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
        System.out.println( "Hello World!" );
        Alien obj1 = (Alien) context.getBean("alien");
        obj1.code();

        Alien obj2 = (Alien) context.getBean("alien");
        obj2.code();
        
    }
}
