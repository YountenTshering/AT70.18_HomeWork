package com.example.ORM.repo;

import com.example.ORM.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ORM.model.Leave;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LeaveRepo extends JpaRepository<Leave, Integer> {

    @Query("FROM Leave l WHERE l.approved = false")
    List<Leave> getAllUnapprovedLeaves();

}