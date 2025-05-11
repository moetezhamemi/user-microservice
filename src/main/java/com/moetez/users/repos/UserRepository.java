package com.moetez.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moetez.users.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	com.moetez.users.entities.User findByUsername(String username);
}
