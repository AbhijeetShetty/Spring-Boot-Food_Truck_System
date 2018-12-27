package com.foodtruck.repository;

import org.springframework.data.repository.CrudRepository;

import com.foodtruck.model.TruckRegistration;



public interface TruckRepository extends CrudRepository<TruckRegistration, Integer> {

}
