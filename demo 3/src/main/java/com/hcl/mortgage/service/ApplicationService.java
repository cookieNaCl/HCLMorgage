package com.hcl.mortgage.service;

import com.hcl.mortgage.entity.Application;

import java.util.List;

public interface ApplicationService {

    public void createNewApplication(Application application);

    public List<Application> getAll();

    public void approveApplication(int id, String approverComment);

    public void rejectApplication(int id,String approverComment);

}
