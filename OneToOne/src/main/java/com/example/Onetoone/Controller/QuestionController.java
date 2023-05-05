package com.example.Onetoone.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Onetoone.Model.QModel;
import com.example.Onetoone.Repository.QRepo;

@RestController
public class QuestionController {

	@Autowired
	QRepo rep;
	
	//posting the given details
	@PostMapping("/post")
	public String adddetails(@RequestBody QModel ques)
	{
		rep.save(ques);
		return "saved successfully";
		
	}
}
