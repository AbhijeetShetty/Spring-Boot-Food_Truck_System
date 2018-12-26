package com.foodtruck.model;

import java.io.Serializable;

public class UserRegistrationId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String loginType;
	
	 String loginId;
	 
	 public UserRegistrationId() {
			
		}
	public UserRegistrationId(String loginType, String loginId) {
		super();
		this.loginType = loginType;
		this.loginId = loginId;
	}
	 
	 
	 
}
