package com.solvd.army.Models.vehicle.Helicopter;

import com.solvd.army.Models.vehicle.Vehicle;

public class Helicopter extends Vehicle {
	
	private int numberOfRotors;

	
	public int getNumberOfRotors() {
		return numberOfRotors;
	}
	public void setNumberOfRotors(int numberOfRotors) {
		this.numberOfRotors = numberOfRotors;
	}

	public Helicopter() {
		super();
	}
	
	public Helicopter(int maxSpeed, int capacity, int fuelCapacity,int numberOfRotors) {
		super(maxSpeed, capacity, fuelCapacity);
		this.numberOfRotors = numberOfRotors;
	}
	
	

	
}
