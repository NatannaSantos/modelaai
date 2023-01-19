package com.modelaai.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modelaai.api.model.Car;

public interface CarRepository extends JpaRepository<Car,Long> {
    
}
