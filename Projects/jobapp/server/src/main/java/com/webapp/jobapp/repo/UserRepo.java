package com.webapp.jobapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webapp.jobapp.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{

    User findByUsername(String username);
}
