package com.example.springthymelogin.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.springthymelogin.model.User;
import com.example.springthymelogin.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
