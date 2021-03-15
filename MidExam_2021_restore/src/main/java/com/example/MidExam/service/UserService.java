package com.example.MidExam.service;

import java.util.List;

import com.example.MidExam.model.User;

public interface UserService {

    User findById(int id);

    List<User> findAllUsers();

    User findByUsername(String username);

    void save(User user);

    void delete(User user);

}
