package com.hcl.mortgage.repo;

import org.springframework.data.repository.CrudRepository;

import com.hcl.mortgage.entity.Manager;
import com.hcl.mortgage.entity.User;

public interface ManagerRepository extends CrudRepository<Manager, Integer> {

}
