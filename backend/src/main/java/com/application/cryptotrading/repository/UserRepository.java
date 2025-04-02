package com.application.cryptotrading.repository;



import com.application.cryptotrading.model.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);

}
