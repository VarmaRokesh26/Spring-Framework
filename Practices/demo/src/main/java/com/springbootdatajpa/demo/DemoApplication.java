package com.springbootdatajpa.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springbootdatajpa.demo.model.Student;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);

		s1.setRollNo(101);
		s1.setName("Shreyas");
		s1.setMarks(80);

		Student s2 = context.getBean(Student.class);

		s2.setRollNo(37);
		s2.setName("Guru Dev Singh P B S");
		s2.setMarks(90);

		Student s3 = context.getBean(Student.class);

		s3.setRollNo(86);
		s3.setName("Varma");
		s3.setMarks(95);

		// System.out.println("Hello");

		repo.save(s1);
		repo.save(s2);
		repo.save(s3);
	}

}
