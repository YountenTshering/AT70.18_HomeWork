package com.example.MVCRestful.dao;

import com.example.MVCRestful.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJPADao extends JpaRepository<User, Integer> {
    
}
