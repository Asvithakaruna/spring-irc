package com.example.project1.Controller;

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
}
