package com.example.CompletableFuture.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CompletableFuture.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

}
