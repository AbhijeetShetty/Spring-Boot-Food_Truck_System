package com.foodtruck.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;

@Entity(name = "feedback_tab")
@Table(name = "feedback_tab")
public class Feedback implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Min(0)
	@Max(5)
	@Column(name = "overAllExperience")
	public int overAllExperience;
	
	@Min(0)
	@Max(5)
	@Column(name = "satisfaction")
	public int satisfaction;

	
	@Min(0)
	@Max(5)
	@Column(name = "rateOfRecommendation")
	public int rateOfRecommendation;

	@Column(name = "anySuggestions")
	public String anySuggestions;

	@Id
	@Column(name = "truckId")
	public int truckId;
	
	
	public Feedback() {
	
	}


	public Feedback(int overAllExperience, int satisfaction, int rateOfRecommendation, String anySuggestions,
			int truckId) {
		super();
		this.overAllExperience = overAllExperience;
		this.satisfaction = satisfaction;
		this.rateOfRecommendation = rateOfRecommendation;
		this.anySuggestions = anySuggestions;
		this.truckId = truckId;
	}

	public int getOverAllExperience() {
		return overAllExperience;
	}

	public void setOverAllExperience(int overAllExperience) {
		this.overAllExperience = overAllExperience;
	}

	public int getSatisfaction() {
		return satisfaction;
	}

	public void setSatisfaction(int satisfaction) {
		this.satisfaction = satisfaction;
	}

	public int getRateOfRecommendation() {
		return rateOfRecommendation;
	}

	public void setRateOfRecommendation(int rateOfRecommendation) {
		this.rateOfRecommendation = rateOfRecommendation;
	}

	public String getAnySuggestions() {
		return anySuggestions;
	}

	public void setAnySuggestions(String anySuggestions) {
		this.anySuggestions = anySuggestions;
	}

	public int getTruckId() {
		return truckId;
	}

	public void setTruckId(int truckId) {
		this.truckId = truckId;
	}

	@Override
	public String toString() {
		return "Feedback [overAllExperience=" + overAllExperience + ", satisfaction=" + satisfaction
				+ ", rateOfRecommendation=" + rateOfRecommendation + ", anySuggestions=" + anySuggestions + ", truckId="
				+ truckId + "]";
	}

	
}
