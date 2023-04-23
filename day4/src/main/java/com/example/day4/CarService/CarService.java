package com.example.day4.CarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day4.Repository.CarRepository;
import com.example.day4.model.CarModel;

@Service
public class CarService {

	@Autowired
	public CarRepository crepo;
	public CarModel saveinfo(CarModel c)
	{
		return crepo.save(c);
	}
}
