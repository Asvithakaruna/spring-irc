package com.example.project1.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.project1.JeeApplication.JeeModel;

import jakarta.transaction.Transactional;

public interface JeeRepository extends JpaRepository<JeeModel, Integer> {
	JeeModel findByuname(String uname);

	@Query(value="select * from Jeeapplication",nativeQuery=true)
	public List<JeeModel> getAllData();
	
	@Query(value="select * from Jeeapplication where canditateid=:id",nativeQuery=true)
	public List<JeeModel> bycanditatename(@Param("id")int id);

	@Query(value="select * from Jeeapplication where canditateid between ?1 and ?2",nativeQuery=true)
	public List<JeeModel>startEnd(@Param("start")int start,@Param("end")int end);
	
	@Modifying
	@Transactional
	@Query(value="delete from Jeeapplication where canditateid=?1 and canditatename=?2",nativeQuery=true)
	Integer deleteId(@Param("id")int canditateid,@Param("name")String canditatename);
	
	@Modifying
	@Transactional
	@Query(value="update Jeeapplication set canditateid=:id where canditatename=:name",nativeQuery=true)
	public void updateByQuery(@Param("id")int id,@Param("name") String name);
	
	@Query("select j from JeeModel j where canditatename=?1")
	public List<JeeModel>getjpqlname(String name);
	
	@Query("select j from JeeModel j where canditateid between ?1 and ?2")
	public List<JeeModel>getbtw(int start,int end);
	
	@Modifying
	@Transactional
	@Query("delete from JeeModel where id=?1")
	public void deletejpqlid(int id);
	
	@Modifying
	@Transactional
	@Query("update JeeModel set district =?1 where id=?2")
	public void updatejpql(String a,int b);
	
	
}
