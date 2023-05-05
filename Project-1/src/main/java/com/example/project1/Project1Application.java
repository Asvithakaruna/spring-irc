package com.example.project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		info =@Info(
		title = "JeeApplication",
		version = "1.1.2",
		description = "Jee",
		contact = @Contact(
		name = "Asvitha",
		email = "Asvithagmail.com"
		)
		)
		)
public class Project1Application {

	public static void main(String[] args) {
		SpringApplication.run(Project1Application.class, args);
	}

}
