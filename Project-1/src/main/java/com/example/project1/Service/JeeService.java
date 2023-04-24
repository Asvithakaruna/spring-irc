package com.example.project1.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project1.JeeApplication.JeeModel;
import com.example.project1.Repository.JeeRepository;

@Service
public class JeeService {
	@Autowired
	public JeeRepository jrepo;
	public JeeModel saveinfo(JeeModel j)
	{
		return jrepo.save(j);
	}
	public Optional<JeeModel> getdetails(int id) {
		// TODO Auto-generated method stub
		return jrepo.findById(id);
	}
	public JeeModel updatedetails(JeeModel id) {
		// TODO Auto-generated method stub
		return jrepo.saveAndFlush(id);
	}
	public void deletedetails(int id) {
		// TODO Auto-generated method stub
		jrepo.deleteById(id);
	}

}
