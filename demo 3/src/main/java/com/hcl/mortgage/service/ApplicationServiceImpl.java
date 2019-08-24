package com.hcl.mortgage.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.mortgage.repo.ApplicationRepository;
import com.hcl.mortgage.repo.ManagerRepository;

public class ApplicationServiceImpl implements ApplicationService {
	
	private ApplicationRepository applicationRepository;

	@Autowired
	public ApplicationServiceImpl(ApplicationRepository applicationRepository) {
		this.applicationRepository = applicationRepository;
	}	
	
	
}
