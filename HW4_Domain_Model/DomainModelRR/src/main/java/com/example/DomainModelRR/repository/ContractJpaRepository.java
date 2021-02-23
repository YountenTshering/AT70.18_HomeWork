package com.example.DomainModelRR.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DomainModelRR.model.Contract;

public interface ContractJpaRepository extends JpaRepository<Contract, Integer> {

}