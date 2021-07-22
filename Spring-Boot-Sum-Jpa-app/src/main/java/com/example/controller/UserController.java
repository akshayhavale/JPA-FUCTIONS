package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/users")
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@GetMapping("/user/{userId}")
	public Double getTotalQuantityForUserId(@PathVariable(value = "userId") Long userId) {
		return userRepository.sumOfAllQtyByUserId(userId);
	}
}
