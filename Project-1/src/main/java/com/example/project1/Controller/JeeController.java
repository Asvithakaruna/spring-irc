package com.example.project1.Controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project1.JeeApplication.JeeModel;
import com.example.project1.Repository.JeeRepository;
import com.example.project1.Service.JeeService;

@RestController
public class JeeController {

	@Autowired
	public JeeService jser;
	@PostMapping("/saveJee")
	public JeeModel addDetails(@RequestBody JeeModel jm)
	{
		return jser.saveinfo(jm);
	}
	//Get
	@GetMapping("/saveJee/{id}")
	public Optional<JeeModel>getdetails(@PathVariable("id") int id)
{
	return jser.getdetails(id);
}
	//update
	@PutMapping("/update")
	public JeeModel updatedetails(@RequestBody JeeModel id)
	{
		return jser.updatedetails(id);
	}
	//delete
	@DeleteMapping("/saveJee/{id}")
	public String deletedetails(@PathVariable("id")int id)
	{
		jser.deletedetails(id);
		return "deleted successfully";
	}
	//sort by descending order
	@GetMapping("/sortAsc/{canditatename}")
	public List<JeeModel> sortcanditate(@PathVariable("canditatename") String canditatename)
	{
		return jser.sortAsc(canditatename);
	}
	//sort by ascending order
	@GetMapping("/sortDesc/{canditatename}")
	public List<JeeModel>sortcanditates(@PathVariable("canditatename")String canditatename)
	{
		return jser.sortDesc(canditatename);
	}
	@GetMapping("/pagination/{pgn}/{pgs}")
	public List<JeeModel>paginationData(@PathVariable("pgn")int pgn,@PathVariable("pgs")int pgs)
	{
		return jser.paginationData(pgn,pgs);
	}
	@GetMapping("/paginationsorting/{pgn}/{pgs}/{canditatename}")
	public List<JeeModel>paginationSorting(@PathVariable("pgn")int pgn,@PathVariable("pgs")int pgs,@PathVariable("canditatename")String canditatename)
	{
		return jser.paginationAndSorting(pgn,pgs,canditatename);
	}
	@Autowired
	public JeeRepository jsr;
	
	@GetMapping("/Jee")
	public List<JeeModel> getD()
	{
		return jsr.getAllData();
	}
	@GetMapping("/byName/{id}")
	public List<JeeModel>getName(@PathVariable("id") int id)
	{
		return jsr.bycanditatename(id);
	}
	//login
	@PostMapping("/login")
	public String login(@RequestBody Map<String, String> logindata)
	{
		String uname=logindata.get("uname");
		String password=logindata.get("password");
		String result=jser.checklogin(uname,password);
		return result;
	}
}
