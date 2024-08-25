package com.jdbcpractice.mysqlpractice;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jdbcpractice.mysqlpractice.model.Student;
import com.jdbcpractice.mysqlpractice.service.StudentService;

@SpringBootApplication
public class MysqlpracticeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MysqlpracticeApplication.class, args);
		// System.out.println("Hello World");
		Student s = context.getBean(Student.class);
		s.setRollNo(1);
		s.setName("Varma");
		s.setMarks(100);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);

		List<Student> students = service.getStudents();
		for(Student st : students) {
			System.out.println(st);
		}
	}

}
