package com.example.ORM.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ORM.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
