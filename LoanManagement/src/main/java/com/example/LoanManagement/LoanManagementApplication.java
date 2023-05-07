package com.example.LoanManagement;

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
public class LoanManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanManagementApplication.class, args);
	}

}
