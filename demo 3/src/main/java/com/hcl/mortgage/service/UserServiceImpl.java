package com.hcl.mortgage.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.mortgage.repo.UserRepository;

public class UserServiceImpl implements UserService {
	private UserRepository userRepository;

	@Autowired
	public UserServiceImpl(UserRepository employeeRepository) {
		this.userRepository = userRepository;
	}
	
	
}
