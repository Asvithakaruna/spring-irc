package com.example.Onetoone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Onetoone.Model.QModel;

public interface QRepo extends JpaRepository<QModel, Integer> {

}
