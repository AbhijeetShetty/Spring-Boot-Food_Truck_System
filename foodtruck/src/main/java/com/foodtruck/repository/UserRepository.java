package com.foodtruck.repository;

import org.springframework.data.repository.CrudRepository;

import com.foodtruck.model.UserRegistration;

public interface UserRepository extends CrudRepository<UserRegistration, String>{

	

}
