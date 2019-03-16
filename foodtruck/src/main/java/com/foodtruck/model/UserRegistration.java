package com.foodtruck.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "user_tab")
@IdClass(UserRegistrationId.class)
@Table(name = "user_tab")
public class UserRegistration implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@NotBlank(message = "Login Type must not be blank!")
	@Column(name = "loginType")
	String loginType;

	@Id
	@NotBlank(message = "Login name must not be blank!")
	//@OneToMany(targetEntity = TruckRegistration.class)
	@Column(name = "loginId")
	String loginId;

	@Column(name = "password")
	@JsonIgnore
	private String password;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;
	
	@Pattern(regexp="\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b",message = "Provided Email should be valid")
	@Column(name = "emailId")
	private String emailId;

	@Size(min = 10, max = 10)
	@Column(name = "mobileNumber")
	private String mobileNumber;

	public UserRegistration() {

	}

	

	public UserRegistration(int userId, String loginType,
			 String loginId, String password, String firstName,
			String lastName,
			 String emailId,
			String mobileNumber) {
		super();
		this.loginType = loginType;
		this.loginId = loginId;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
	}




	public String getLoginType() {
		return loginType;
	}

	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}



	@Override
	public String toString() {
		return "UserRegistration [loginType=" + loginType + ", loginId=" + loginId
				+ ", password=" + password + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId="
				+ emailId + ", mobileNumber=" + mobileNumber + "]";
	}

	
	
}
