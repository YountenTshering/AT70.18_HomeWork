package com.example.ORM.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.ORM.model.User;
import com.example.ORM.repo.UserRepo;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        // The service simply find the user by talking to dao, and pass that user to
        // UserDetailsImpl
        User user = userRepo.findByUsername(username);

        if (user == null)
            throw new UsernameNotFoundException("User 404");

        return new UserDetailsImpl(user);
    }

}