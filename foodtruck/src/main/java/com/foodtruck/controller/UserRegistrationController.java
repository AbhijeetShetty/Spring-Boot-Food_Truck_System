package com.foodtruck.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	@PostMapping("/users")
	public @ResponseBody String addNewUser(@RequestParam String loginType, @RequestParam String loginId,
			@RequestParam String password, @RequestParam String firstName, @RequestParam String lastName,
			@RequestParam String emailId, @RequestParam String mobileNumber) {

		UserRegistration newUser = new UserRegistration();
		newUser.setLoginType(loginType);
		newUser.setLoginId(loginId);
		newUser.setPassword(password);
		newUser.setFirstName(firstName);
		newUser.setLastName(lastName);
		newUser.setEmailId(emailId);
		newUser.setMobileNumber(mobileNumber);

		userRepository.save(newUser);
		return "You Are Registered Successfully ";
	}

}
