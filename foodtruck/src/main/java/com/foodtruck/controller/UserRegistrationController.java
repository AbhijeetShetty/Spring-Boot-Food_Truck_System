package com.foodtruck.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.foodtruck.model.Feedback;
import com.foodtruck.model.TruckRegistration;
import com.foodtruck.model.UserRegistration;
import com.foodtruck.repository.FeedbackRepository;
import com.foodtruck.repository.LoginRepository;
import com.foodtruck.repository.TruckRepository;
import com.foodtruck.repository.UserRepository;
import com.foodtruck.service.FeedbackDAOService;
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
	@Autowired
	private FeedbackDAOService feedbackService;
	
	@Autowired
	private FeedbackRepository feedbackRepository;

	@GetMapping("/users")
	public @ResponseBody Iterable<UserRegistration> retriveAllUsers() {
		return userRepository.findAll();

	}

	@GetMapping("/foodtrucks")
	public @ResponseBody Iterable<TruckRegistration> retriveAllFoodTrucks() {
		return truckRepository.findAll();

	}
	@GetMapping("/viewFeedbacks")
	public @ResponseBody Iterable<Feedback> retriveFeedbacks() {
		return feedbackRepository.findAll();

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
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/users")
	public @ResponseBody String addNewUser(@RequestBody UserRegistration newUser) {

		UserRegistration saveUser = userRepository.save(newUser);
		return "You Are Registered Successfully "+saveUser.getEmailId();
	}

	@PostMapping("/foodTruckRegistration")
	public @ResponseBody String addFoodTruck( @RequestBody TruckRegistration truckRegistration) {
		
		TruckRegistration savedTruck = truckService.saveTruck(truckRegistration);

		return "Truck Details Saved with TruckID "+savedTruck.getTruckId();
	}
	
	@PostMapping("/giveFeedback")
	public @ResponseBody String addFeedback( @RequestBody Feedback feedback) {
		
		feedbackService.savefeedback(feedback);

		return "Your Feedback Is Valuable For Us ";
	}

}
