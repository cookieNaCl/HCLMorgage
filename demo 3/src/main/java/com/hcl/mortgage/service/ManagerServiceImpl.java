package com.hcl.mortgage.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.mortgage.repo.ManagerRepository;
import com.hcl.mortgage.repo.UserRepository;

public class ManagerServiceImpl {
	private ManagerRepository managerRepository;

	@Autowired
	public ManagerServiceImpl(ManagerRepository managerRepository) {
		this.managerRepository = managerRepository;
	}
	
}
