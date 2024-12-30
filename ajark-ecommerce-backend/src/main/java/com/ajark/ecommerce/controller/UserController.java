package com.ajark.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajark.ecommerce.model.LoginRequest;
import com.ajark.ecommerce.model.RegistrationRequest;
import com.ajark.ecommerce.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody RegistrationRequest request) {
		System.out.println(request);
		String response = userService.registerUser(request);
		return ResponseEntity.ok(response);
	}

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody LoginRequest request) {
		String response = userService.loginUser(request);
		return ResponseEntity.ok(response);
	}

}
