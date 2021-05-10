package com.example.FinalExam.dao;

import com.example.FinalExam.models.Company;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "company", path = "company")
public interface CompanyDao extends JpaRepository<Company, Integer> {
}
