package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface userService {

	int saveUser(User u);
	List<User> getAllUser();
}
