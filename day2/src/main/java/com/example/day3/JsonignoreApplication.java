package com.example.day3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@SpringBootApplication
public class JsonignoreApplication {

	public static void main(String[] args) throws JsonProcessingException
	{
		SpringApplication.run(JsonignoreApplication.class, args);
		Person obj=new Person(1,"Asvitha",19);
		ObjectMapper obj1=new ObjectMapper();
		String str=obj1.writeValueAsString(obj);
		System.out.println(str);
	}
}
