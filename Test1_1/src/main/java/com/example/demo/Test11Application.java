package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Test11Application {

	public static void main(String[] args) {
		SpringApplication.run(Test11Application.class, args);
	}
	
	@GetMapping("/buenastardes")
	public String buenastardes()
	{
		return String.format("Bien hecho campeon");
	}
	
}
