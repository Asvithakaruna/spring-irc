package com.example.day4.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day4.CarService.CarService;
import com.example.day4.model.CarModel;

@RestController
public class CarController {

	@Autowired
	public CarService cser;
	@PostMapping("/saveCars")
	public CarModel addDetails(@RequestBody CarModel cr)
	{
		return cser.saveinfo(cr);
	}
}
