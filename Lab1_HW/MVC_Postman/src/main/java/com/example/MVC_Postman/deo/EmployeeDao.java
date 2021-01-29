package com.example.MVC_Postman.deo;


import com.example.MVC_Postman.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
