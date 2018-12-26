package com.foodtruck.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.foodtruck.model.UserRegistration;
import com.foodtruck.repository.LoginRepository;

@Service
public class UserService implements LoginRepository {

	
	LoginRepository loginRepository;
	
	@Transactional
	public List<UserRegistration> findOneByUserId(String loginId) {
		List<UserRegistration> user = loginRepository.findOneByUserId(loginId);
		return user;
	}

}
