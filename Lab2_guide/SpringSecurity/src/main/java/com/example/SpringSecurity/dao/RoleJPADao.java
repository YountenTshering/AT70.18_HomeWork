package com.example.SpringSecurity.dao;

import com.example.SpringSecurity.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleJPADao extends JpaRepository<Role, Integer> {

}
