package com.foodtruck.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.foodtruck.model.TruckRegistration;
import com.foodtruck.model.UserRegistration;
import com.foodtruck.repository.LoginRepository;
import com.foodtruck.repository.TruckRepository;
import com.foodtruck.repository.UserRepository;
import com.foodtruck.service.TruckDAOService;

@RestController
@RequestMapping(path = "/foodtruck")
public class UserRegistrationController {

	@Autowired
	private UserRepository userRepository;
	@PersistenceContext
	private EntityManager entityManager;
	@Autowired
	private LoginRepository loginRepository;
	@Autowired
	private TruckRepository truckRepository;
	@Autowired
	private TruckDAOService truckService;

	@GetMapping("/users")
	public @ResponseBody Iterable<UserRegistration> retriveAllUsers() {
		return userRepository.findAll();

	}

	@GetMapping("/foodtrucks")
	public @ResponseBody Iterable<TruckRegistration> retriveAllFoodTrucks() {
		return truckRepository.findAll();

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

	@PostMapping("/foodTruckRegistration")
	public @ResponseBody String addFoodTruck( @RequestBody TruckRegistration truckRegistration) {
		
		TruckRegistration savedTruck = truckService.saveTruck(truckRegistration);

		return "Truck Details Saved with TruckID "+savedTruck.getTruckId();
	}

}
