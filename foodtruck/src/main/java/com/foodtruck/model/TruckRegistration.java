package com.foodtruck.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "food_truck_tab")
@Table(name = "food_truck_tab")
public class TruckRegistration implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "truckId")
	public int truckId;

	@Column(name = "bulkOrderFlag")
	public boolean bulkOrderFlag;

	@Column(name = "truckName")
	public String truckName;

	@Column(name = "loginId")
	public String loginId;

	@Column(name = "days")
	public String days;

	@Column(name = "timeSlot1")
	public String timeSlot1;

	@Column(name = "timeSlot2")
	public String timeSlot2;

	@Column(name = "timeSlot3")
	public String timeSlot3;

	@Column(name = "location1")
	public String location1;

	@Column(name = "location2")
	public String location2;

	@Column(name = "location3")
	public String location3;

	/*
	 * @ManyToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "loginId", referencedColumnName = "loginId") private
	 * Set<UserRegistration> user;
	 */
	public int getTruckId() {
		return truckId;
	}

	public void setTruckId(int truckId) {
		this.truckId = truckId;
	}

	public boolean isBulkOrderFlag() {
		return bulkOrderFlag;
	}

	public void setBulkOrderFlag(boolean bulkOrderFlag) {
		this.bulkOrderFlag = bulkOrderFlag;
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public String getTimeSlot1() {
		return timeSlot1;
	}

	public void setTimeSlot1(String timeSlot1) {
		this.timeSlot1 = timeSlot1;
	}

	public String getTimeSlot2() {
		return timeSlot2;
	}

	public void setTimeSlot2(String timeSlot2) {
		this.timeSlot2 = timeSlot2;
	}

	public String getTimeSlot3() {
		return timeSlot3;
	}

	public void setTimeSlot3(String timeSlot3) {
		this.timeSlot3 = timeSlot3;
	}

	public String getLocation1() {
		return location1;
	}

	public void setLocation1(String location1) {
		this.location1 = location1;
	}

	public String getLocation2() {
		return location2;
	}

	public void setLocation2(String location2) {
		this.location2 = location2;
	}

	public String getLocation3() {
		return location3;
	}

	public void setLocation3(String location3) {
		this.location3 = location3;
	}

	/*
	 * public Set<UserRegistration> getUser() { return user; }
	 * 
	 * public void setUser(Set<UserRegistration> user) { this.user = user; }
	 */

	@Override
	public String toString() {
		return "TruckRegistration [truckId=" + truckId + ", bulkOrderFlag=" + bulkOrderFlag + ", truckName=" + truckName
				+ ", loginId=" + loginId + ", fromDate=" + ", days=" + days + ", timeSlot1=" + timeSlot1
				+ ", timeSlot2=" + timeSlot2 + ", timeSlot3=" + timeSlot3 + ", location1=" + location1 + ", location2="
				+ location2 + ", location3=" + location3 + "]";
	}

}
