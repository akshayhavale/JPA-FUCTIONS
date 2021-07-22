package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	/**
	 * 
	 * @param userId
	 * @return
	 * what ever return type it wont matter for JPA
	 */
	@Query("select SUM(u.qty) from User u where u.userId = ?1")
	Double sumOfAllQtyByUserId(Long userId);

}
