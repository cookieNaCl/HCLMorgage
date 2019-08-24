package com.hcl.mortgage.controller;

import com.hcl.mortgage.entity.Application;
import com.hcl.mortgage.entity.Manager;
import com.hcl.mortgage.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("mortgage")
public class ApplicationController {

    @Autowired
    ApplicationService applicationService;


    @PostMapping(value = "/user")
    public void createNewApplicationForUser(
            @RequestBody Application application
    ) {
        applicationService.createNewApplication(application);
        return;
    }


    @PutMapping(value = "/manager/approve/{comment}")
    public void approveApplication(
            @RequestBody Manager manager,
            @PathVariable String comment
    ) {
        applicationService.approveApplication(manager.getId(), comment);
    }

    @PutMapping(value = "/manager/reject/{comment}")
    public void rejectApplication(
            @RequestBody Manager manager,
            @PathVariable String comment
    ) {
        applicationService.rejectApplication(manager.getId(), comment);
    }

    @GetMapping(value = "/manager/getAll")
    public List<Application> getAllApplicationsForManager(){
        return applicationService.getAll();
    }

}