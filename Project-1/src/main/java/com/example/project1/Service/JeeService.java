package com.example.project1.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
	public List<JeeModel> sortAsc(String canditatename) {
		// TODO Auto-generated method stub
		return jrepo.findAll(Sort.by(canditatename).ascending());
	}
	public List<JeeModel>paginationData(int pgn,int pgs)
	{
		Page<JeeModel>p=jrepo.findAll(PageRequest.of(pgn, pgs));
		return p.getContent();
	}
	public List<JeeModel> paginationAndSorting(int pgn, int pgs, String canditatename) {
		// TODO Auto-generated method stub
	    Page<JeeModel>p=jrepo.findAll(PageRequest.of(pgn, pgs));
	    return p.getContent();
	}
	public String checklogin(String uname, String password) {
		// TODO Auto-generated method stub
		JeeModel user=jrepo.findByuname(uname);
		if(user==null)
		{
			return "No user found";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return "Login successfull";
			}
			else
			{
				return"Login failed";
			}
		}
	}
	public List<JeeModel> sortDesc(String canditatename) {
		// TODO Auto-generated method stub
		return jrepo.findAll(Sort.by(canditatename).descending());
	}

	
}
