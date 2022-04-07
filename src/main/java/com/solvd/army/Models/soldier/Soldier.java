package com.solvd.army.Models.soldier;

public class Soldier {
	
	private String name;
	private double weight;
	private double height;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public Soldier() {}
	
	public Soldier(String name, double weight, double height) {
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	
	
	

}
