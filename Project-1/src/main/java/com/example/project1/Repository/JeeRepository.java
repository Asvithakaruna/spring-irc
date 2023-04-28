package com.example.project1.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.project1.JeeApplication.JeeModel;

public interface JeeRepository extends JpaRepository<JeeModel, Integer> {
	JeeModel findByuname(String uname);

	@Query(value="select * from Jeeapplication",nativeQuery=true)
	public List<JeeModel> getAllData();
	
	@Query(value="select * from Jeeapplication where canditateid=:id",nativeQuery=true)
	public List<JeeModel> bycanditatename(@Param("id")int id);
	
	
}
