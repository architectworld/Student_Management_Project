package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.userRepo;
import com.example.demo.service.userService;

@Service
public class userServiceImpl implements userService {
	
	@Autowired
	private userRepo repo;

	@Override
	public int saveUser(User u) {
		User uu = repo.save(u);
		return uu.getId();
	}

	@Override
	public List<User> getAllUser() {
		
		List<User> list = repo.findAll();
		return list;
	}

}
