package com.example.FinalExam.dao;

import com.example.FinalExam.models.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Integer> {

}