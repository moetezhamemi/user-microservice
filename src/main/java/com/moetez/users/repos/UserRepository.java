package com.moetez.users.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moetez.users.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	com.moetez.users.entities.User findByUsername(String username);
	Optional<User> findByEmail(String email);
	
}
