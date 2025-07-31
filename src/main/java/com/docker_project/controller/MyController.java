package com.docker_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/springboot")
public class MyController {
	
	@GetMapping("/docker")
	public String message() {
		return "Hello everyone this is from Springboot to Docker...running on port 9090!!!";
		
	}

}
