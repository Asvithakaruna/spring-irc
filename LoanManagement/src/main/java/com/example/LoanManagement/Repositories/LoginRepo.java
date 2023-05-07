package com.example.LoanManagement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LoanManagement.Models.LoginModel;

public interface LoginRepo extends JpaRepository<LoginModel, Integer> {

}
