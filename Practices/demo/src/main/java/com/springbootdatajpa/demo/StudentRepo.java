package com.springbootdatajpa.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootdatajpa.demo.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
