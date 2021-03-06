package com.example.ORM.service;

import com.example.ORM.model.Employee;
import com.example.ORM.model.Leave;
import com.example.ORM.model.LeaveType;
import com.example.ORM.model.SickLeave;
import com.example.ORM.repo.LeaveRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveServiceImpl implements LeaveService {

    @Autowired
    private LeaveRepo leaveRepo;

    @Override
    public List<Leave> getAllLeaves() {
        return leaveRepo.findAll();
    }

    @Override
    public List<Leave> getAllUnapprovedLeaves() {
        return leaveRepo.getAllUnapprovedLeaves();
    }

    @Override
    public void save(Leave leave) {
        leaveRepo.save(leave);
    }

    @Override
    public void deleteById(int id) {
        leaveRepo.deleteById(id);
    }

    @Override
    public Leave getLeaveById(int id) {
        return leaveRepo.findById(id).orElse(null);
    }
}