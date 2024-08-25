package com.jdbcpractice.mysqlpractice.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jdbcpractice.mysqlpractice.model.Student;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;
    
    public void save(Student s) {
        
        String query = "INSERT INTO student (rollNo, s_name, marks) VALUES(?, ?, ?)";

        int rows = jdbc.update(query, s.getRollNo(), s.getName(), s.getMarks());
        System.out.println(rows + "effected");
    }

    public List<Student> findAll() {
        String query = "SELECT * FROM student";

        return jdbc.query(query, (resultSet, rowNum) -> {
            Student student = new Student();
            student.setRollNo(resultSet.getInt("rollNo"));
            student.setName(resultSet.getString("s_name"));
            student.setMarks(resultSet.getInt("marks"));

            return student;
        });
    }

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
}
