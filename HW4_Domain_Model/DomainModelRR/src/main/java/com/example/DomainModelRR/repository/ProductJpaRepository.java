package com.example.DomainModelRR.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DomainModelRR.model.Product;

public interface ProductJpaRepository extends JpaRepository<Product, Integer> {

}