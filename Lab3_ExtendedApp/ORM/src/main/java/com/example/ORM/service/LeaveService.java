package com.example.ORM.service;

import com.example.ORM.model.Employee;
import com.example.ORM.model.Leave;

import java.util.List;

public interface LeaveService {

    List<Leave> getAllLeaves();

    List<Leave> getAllUnapprovedLeaves();

    void save(Leave leave);

    void deleteById(int id);

    Leave getLeaveById(int id);

}