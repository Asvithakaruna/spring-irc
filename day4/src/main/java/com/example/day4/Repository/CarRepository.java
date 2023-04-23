package com.example.day4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day4.model.CarModel;

public interface CarRepository extends JpaRepository<CarModel, Integer> {

}
