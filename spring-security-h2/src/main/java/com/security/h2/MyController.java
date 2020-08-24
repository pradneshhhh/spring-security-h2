package com.security.h2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/")
	public String home(){
		return "Welcome";
	}
	
	@GetMapping("/user")
	public String authUser(){
		return "Welcome User";
	}
	
	@GetMapping("/admin")
	public String authAdmin(){
		return "Welcome Admin";
	}
}
