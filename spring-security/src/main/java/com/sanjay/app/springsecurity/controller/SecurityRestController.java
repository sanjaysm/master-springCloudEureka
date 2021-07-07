package com.sanjay.app.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eKart-service")
public class SecurityRestController {
	@GetMapping("/test-api")
	public String home() {
		return "Home";
	}

	@GetMapping("/user")
	public String getUserData(@PathVariable String id) {
		//Object obj = restTemplate.getForObject(BASE_URL + "/" + id, Object.class);
		//System.out.println("RESPONSE : " + obj);
		return "welcome user";
	}
	@GetMapping("/admin")
	public String admin() {
		return "Admin";
	}

}
