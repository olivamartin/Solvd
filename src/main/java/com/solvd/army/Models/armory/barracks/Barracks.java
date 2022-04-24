package com.solvd.army.Models.armory.barracks;

public class Barracks {
	
	private int capacity;
	private String size;
	private String name;
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Barracks() {}
	
	public Barracks(int capacity, String size, String name) {
		this.capacity = capacity;
		this.size = size;
		this.name = name;
	}
	
	
	

}
