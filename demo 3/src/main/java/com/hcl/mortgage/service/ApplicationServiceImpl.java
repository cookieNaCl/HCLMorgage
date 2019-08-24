package com.hcl.mortgage.service;

import com.hcl.mortgage.entity.Application;
import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.mortgage.repo.ApplicationRepository;
import com.hcl.mortgage.repo.ManagerRepository;

import java.util.List;
import java.util.Optional;

public class ApplicationServiceImpl implements ApplicationService {
	
	private ApplicationRepository applicationRepository;

	@Autowired
	public ApplicationServiceImpl(ApplicationRepository applicationRepository) {
		this.applicationRepository = applicationRepository;
	}


	@Override
	public void createNewApplication(Application application) {
		applicationRepository.save(application);
	}

	@Override
	public List<Application> getAll() {
		return (List<Application>) applicationRepository.findAll();
	}

	@Override
	public void approveApplication(int id, String approverComment) {
		Application application = applicationRepository.findById(id).get();
		if(application.getStatus()=="Requested") {
			application.setStatus("Approved");
		}else if(application.getStatus() == "Approved"){
			application.setStatus("SeniorApproved");
		}
		application.setComments(approverComment);
		applicationRepository.save(application);
	}

	@Override
	public void rejectApplication(int id, String approverComment) {

		Application application = applicationRepository.findById(id).get();
		application.setStatus("Rejected");
		application.setComments(approverComment);
		applicationRepository.save(application);

	}
}
