package com.hcl.mortgage.repo;

import org.springframework.data.repository.CrudRepository;

import com.hcl.mortgage.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
