package com.springsecuritydemo.securitydemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsecuritydemo.securitydemo.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{

    User findByUsername(String username);
}
