package com.foodtruck.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.foodtruck.model.UserRegistration;
import com.foodtruck.repository.LoginRepository;
import com.foodtruck.repository.UserRepository;

@RestController
@RequestMapping(path = "/foodtruck")
public class UserRegistrationController {

	@Autowired
	private UserRepository userRepository;
	@PersistenceContext
	private EntityManager entityManager;
	@Autowired
	private LoginRepository loginRepository;

	@GetMapping("/users")
	public @ResponseBody Iterable<UserRegistration> retriveAllUsers() {
		return userRepository.findAll();

	}

	@GetMapping("/login/{loginId}")
	public @ResponseBody List<UserRegistration> checkUsers(@PathVariable String loginId) {

		
		System.out.println("LoginId ::: " + loginId);
		List<UserRegistration> users = loginRepository.findOneByUserId(loginId);

		if (users == null)
			System.out.println("Its null ...");
		else
			System.out.println("Not null");
		return users;

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
