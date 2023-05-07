package com.example.LoanManagement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LoanManagement.Models.UserModel;

public interface UserRepo extends JpaRepository<UserModel, Integer> {

}
