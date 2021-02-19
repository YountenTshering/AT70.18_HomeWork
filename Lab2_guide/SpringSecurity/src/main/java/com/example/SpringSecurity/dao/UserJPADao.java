package com.example.SpringSecurity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.SpringSecurity.model.User;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserJPADao extends JpaRepository<User, Integer> {
    // extends repository JPA
    // allows easy swap out

    // Use JPA automatic association function
    // it says to add this function as well
    User findByUsername(String username);
}
