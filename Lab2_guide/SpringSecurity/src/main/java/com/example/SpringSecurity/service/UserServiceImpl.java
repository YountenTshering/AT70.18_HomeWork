package com.example.SpringSecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.SpringSecurity.dao.UserJPADao;
import com.example.SpringSecurity.model.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserJPADao userdao;

    @Autowired
    private BCryptPasswordEncoder bCryptEncoder;

    @Autowired
    private EmailService emailService;

    @Override
    public void save(User user) {
        System.out.println("Added in h2");
        String hashedPassword = bCryptEncoder.encode(user.getPassword());
        user.setPassword(hashedPassword);
        user.setActive(true);
        userdao.save(user);

        // successful registration -> send emails
        SimpleMailMessage emailMsg = new SimpleMailMessage();
        emailMsg.setTo(user.getEmail());
        emailMsg.setText("You are registered!");
        emailMsg.setSubject("Registration successful!");
        emailMsg.setFrom("admin@random.asia");

        try {
            emailService.sendEmail(emailMsg);
            System.out.println("successful registered");

        } catch (MailException ex) {
            // simply log it and go on...
            System.err.println(ex.getMessage());
        }

    }

    @Override
    public User findByUsername(String username) {
        return userdao.findByUsername(username);
    }
}
