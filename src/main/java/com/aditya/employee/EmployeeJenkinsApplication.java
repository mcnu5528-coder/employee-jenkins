package com.aditya.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/jenkins")
@SpringBootApplication
public class EmployeeJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeJenkinsApplication.class, args);
	}
	@GetMapping
	public String getMessage()
	{
		return "this is jenkins";
	}

}
