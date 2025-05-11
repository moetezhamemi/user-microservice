package com.moetez.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.moetez.users.service.UserService;
import com.moetez.users.entities.Role;
import com.moetez.users.entities.User;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class UserMicroserviceApplication {

    @Autowired
    UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(UserMicroserviceApplication.class, args);
    }




}