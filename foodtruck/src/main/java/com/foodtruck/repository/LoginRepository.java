package com.foodtruck.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.foodtruck.model.UserRegistration;

@Service
public interface LoginRepository {

	// Named Parameters in JPQL here we are passing parameters in query using @Parm
	// annotation
	@Query(value = "select * from UserRegistration where loginId = :loginId")
	List<UserRegistration> findOneByUserId(@Param("loginId") String loginId);
}
