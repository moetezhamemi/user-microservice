package com.moetez.users.service;

import java.util.List;
import java.util.Optional;

import com.moetez.users.entities.Role;
import com.moetez.users.entities.User;
import com.moetez.users.service.register.RegistrationRequest;
public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	
	User registerUser(RegistrationRequest request);
	
	public void sendEmailUser(User u, String code);
	public User validateToken(String code);


}