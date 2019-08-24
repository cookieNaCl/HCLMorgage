package com.hcl.mortgage.repo;

import org.springframework.data.repository.CrudRepository;

import com.hcl.mortgage.entity.Application;

public interface ApplicationRepository extends CrudRepository<Application, Integer> {

}
