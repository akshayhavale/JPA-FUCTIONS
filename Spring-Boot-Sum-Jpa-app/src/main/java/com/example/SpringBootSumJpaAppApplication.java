package com.example;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.User;
import com.example.repository.UserRepository;

@SpringBootApplication
public class SpringBootSumJpaAppApplication {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSumJpaAppApplication.class, args);
	}

	@PostConstruct
	public void createUser() {
		User user1 = new User(1L, 3);
		User user2 = new User(1L, 3);
		User user3 = new User(1L, 3);

		List<User> users = Arrays.asList(user1, user2, user3);

		userRepository.saveAll(users);
	}

}
