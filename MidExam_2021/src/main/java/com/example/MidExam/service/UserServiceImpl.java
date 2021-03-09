package com.example.MidExam.service;

import com.example.MidExam.model.User;
import com.example.MidExam.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    BCryptPasswordEncoder encoder;

    // to save after edit
    @Override
    public void save(User user) {
        String password = user.getPassword();
        String hashPassword = encoder.encode(password);
        user.setActive(true);
        userRepo.save(user);
    }

    // to find user
    @Override
    public User findByUsername(String username) {
        return userRepo.findByUsername(username);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepo.findAll();
    }

    // to update
    @Override
    public User findById(int id) {
        return userRepo.findById(id).orElse(new User());
    }

    @Override
    public void delete(User user) {
        userRepo.delete(user);

    }

}
