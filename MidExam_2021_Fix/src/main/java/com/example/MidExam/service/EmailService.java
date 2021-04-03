package com.example.MidExam.service;

import java.util.List;

import com.example.MidExam.model.Employee;

import org.springframework.mail.SimpleMailMessage;

public interface EmailService {
    void sendEmail(SimpleMailMessage emailMsg);

    static List<Employee> getEmpolyee() {
        return null;
    }

}
