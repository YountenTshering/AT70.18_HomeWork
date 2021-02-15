package com.example.SpringSecurity.service;

import com.example.SpringSecurity.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
