package com.example.ORM.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ORM.model.Leave;

public interface LeaveRepo extends JpaRepository<Leave, Integer> {

}