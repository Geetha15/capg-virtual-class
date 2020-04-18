package com.capg.springboot.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.model.User;
@RestController
@RequestMapping("/api")
public class UserRestController {
	
	@GetMapping("/users")
	public User getUser() {
		User user=new User("Geetha", "Geetha@yahoo.com", 
				LocalDate.of(1999, 8, 7), 345678976L);
		return user;
	}
}
