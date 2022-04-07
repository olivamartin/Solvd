package com.solvd.army.Models.armory;

public class Armory {
	
	private int identificationNumber;
	private String personalAllowed;
	
	public int getIdentificationNumber() {
		return identificationNumber;
	}
	
	public void setIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	
	public String getPersonalAllowed() {
		return personalAllowed;
	}
	
	public void setPersonalAllowed(String personalAllowed) {
		this.personalAllowed = personalAllowed;
	}

	public Armory() {}

	public Armory(int identificationNumber, String personalAllowed) {
		this.identificationNumber = identificationNumber;
		this.personalAllowed = personalAllowed;
	}
	
	
	
	

}
