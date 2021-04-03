package com.example.MidExam.service;

import java.util.List;

import com.example.MidExam.model.Employee;

public interface EmpolyeeService {

    void save(Employee course);

    List<Employee> getAllEmployees();

    Employee findById(int id);

    void removeEmployeeById(int id);

}
