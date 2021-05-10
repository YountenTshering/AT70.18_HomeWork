package com.example.FinalExam.services;

import com.example.FinalExam.models.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
