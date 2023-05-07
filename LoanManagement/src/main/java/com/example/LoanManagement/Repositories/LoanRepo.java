package com.example.LoanManagement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LoanManagement.Models.LoanApplicationModel;

public interface LoanRepo extends JpaRepository<LoanApplicationModel, Integer> {

}
