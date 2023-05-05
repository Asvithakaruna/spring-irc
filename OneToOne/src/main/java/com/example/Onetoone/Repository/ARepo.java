package com.example.Onetoone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Onetoone.Model.AModel;

public interface ARepo extends JpaRepository<AModel, Integer> {

}
