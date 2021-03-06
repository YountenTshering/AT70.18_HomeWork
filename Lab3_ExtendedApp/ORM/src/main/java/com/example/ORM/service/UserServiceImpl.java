package com.example.ORM.service;

import com.example.ORM.model.User;
import com.example.ORM.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public User findByUsername(String username) {
        return userRepo.findByUsername(username);
    }
}
