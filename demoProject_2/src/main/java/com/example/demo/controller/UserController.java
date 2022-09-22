package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.userService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200/")
public class UserController {
	
	@Autowired
	private userService service;
	
	@PostMapping("/insert")
	public ResponseEntity<String> saveUser(@RequestBody User u){
		
		int id=service.saveUser(u);
		String body= "user save with id "+id;
		
		return ResponseEntity.ok(body);
	}
	
	
	@GetMapping("/all")
	public List<User> getAllUser(){
		
		List<User> li= service.getAllUser();
		
		return li;
		
	}

}
