package com.moetez.users.service.register;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RegistrationRequest {
	private String username;
	private String password;
	private String email;
	

}
