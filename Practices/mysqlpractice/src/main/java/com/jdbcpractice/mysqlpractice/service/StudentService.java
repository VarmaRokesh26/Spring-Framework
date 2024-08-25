package com.jdbcpractice.mysqlpractice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdbcpractice.mysqlpractice.model.Student;
import com.jdbcpractice.mysqlpractice.repo.StudentRepo;

@Service
public class StudentService {

    private StudentRepo strepo;

    public StudentRepo getRepo() {
        return strepo;
    }

    @Autowired
    public void setRepo(StudentRepo strepo) {
        this.strepo = strepo;
    }

    public void addStudent(Student s) {
        System.out.println("Student is added to the DB");
        strepo.save(s);
    }

    public List<Student> getStudents() {
        return strepo.findAll();
    }
}
