package com.foodtruck.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.foodtruck.model.UserRegistration;
import com.foodtruck.repository.UserRepository;

@RestController
@RequestMapping(path = "/foodtruck")
public class UserRegistrationController {

	@Autowired
	private UserRepository userRepository;
	@PersistenceContext
	private EntityManager entityManager;

	@GetMapping("/users")
	public @ResponseBody Iterable<UserRegistration> retriveAllUsers() {
		return userRepository.findAll();

	}

}


