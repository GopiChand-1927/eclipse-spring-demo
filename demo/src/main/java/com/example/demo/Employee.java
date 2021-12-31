package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee {
	@Value("${employee.name}")
private String Name;
	
	@GetMapping("/name")
	public String getName() {
		return "employee :" +Name;
	}
}