package com.example.MidExam.service;

import com.example.MidExam.model.Employee;
import com.example.MidExam.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpolyeeServiceImpl implements EmpolyeeService {

    @Autowired
    EmployeeRepo empolyeeRepo;

    // for add
    @Override
    public void save(Employee employee) {
        empolyeeRepo.save(employee);
    }

    // to view
    @Override
    public List<Employee> getAllEmployees() {
        return empolyeeRepo.findAll();
    }

    // to update
    @Override
    public Employee findById(int id) {
        return empolyeeRepo.findById(id).orElse(new Employee());
    }

    @Override
    public void removeEmployeeById(int id) {
        empolyeeRepo.deleteById(id);
    }

}
