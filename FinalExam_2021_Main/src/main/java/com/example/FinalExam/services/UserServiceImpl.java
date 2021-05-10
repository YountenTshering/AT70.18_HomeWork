package com.example.FinalExam.services;

import com.example.FinalExam.dao.UserJPADao;
import com.example.FinalExam.models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserJPADao userdao;

	@Autowired
	private BCryptPasswordEncoder bcryptEncoder;

	@Autowired
	private EmailService emailService;

	@Override
	public void save(User user) {
		System.out.println("check");
		String hashedPassword = bcryptEncoder.encode(user.getPassword());
		user.setPassword(hashedPassword);
		user.setActive(true);
		userdao.save(user);

		// successful Update if done -> send emails
		SimpleMailMessage emailMsg = new SimpleMailMessage();
		emailMsg.setTo(user.getEmail());
		emailMsg.setText("You are Updated!");
		emailMsg.setSubject("Successful!");
		emailMsg.setFrom("admin@random.asia");

		try {
			emailService.sendEmail(emailMsg);
			System.out.println("successful Update");

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
