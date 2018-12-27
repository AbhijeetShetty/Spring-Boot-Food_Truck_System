package com.foodtruck.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.foodtruck.model.TruckRegistration;
import com.foodtruck.repository.TruckRepository;


@Component
public class TruckDAOService {
	
	@Autowired
	TruckRepository truckRepository;
	
	public TruckRegistration saveTruck(TruckRegistration truckRegistration ) {
		TruckRegistration savedTruck = truckRepository.save(truckRegistration);
		return savedTruck;
	}


}
