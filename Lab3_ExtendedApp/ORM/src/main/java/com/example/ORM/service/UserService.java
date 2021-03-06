package com.example.ORM.service;

import com.example.ORM.model.User;

public interface UserService {
    User findByUsername(String username);
}