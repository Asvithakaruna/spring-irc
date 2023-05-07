package com.example.LoanManagement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LoanManagement.Models.AdminModel;

public interface AdminRepo extends JpaRepository<AdminModel, Integer> {

}
