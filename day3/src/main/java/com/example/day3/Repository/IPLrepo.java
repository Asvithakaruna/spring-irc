package com.example.day3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day3.Model.IPL;

@Repository
public interface IPLrepo extends JpaRepository<IPL,Integer> {

}
