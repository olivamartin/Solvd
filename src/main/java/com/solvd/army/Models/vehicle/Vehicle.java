package com.solvd.army.Models.vehicle;

public abstract class Vehicle {

	private int maxSpeed;
	private int capacity;
	private int fuelCapacity;
	
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public Vehicle() {}
	
	public Vehicle(int maxSpeed, int capacity, int fuelCapacity) {
		this.maxSpeed = maxSpeed;
		this.capacity = capacity;
		this.fuelCapacity = fuelCapacity;
	}
}
