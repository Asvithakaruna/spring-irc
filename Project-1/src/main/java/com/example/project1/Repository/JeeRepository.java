package com.example.project1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project1.JeeApplication.JeeModel;

public interface JeeRepository extends JpaRepository<JeeModel, Integer> {

}
