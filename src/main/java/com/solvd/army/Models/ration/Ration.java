package com.solvd.army.Models.ration;

public class Ration {
	
	private String type;
	private int inventoryId;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}

	public Ration() {}

	public Ration(String type, int inventoryId) {
		this.type = type;
		this.inventoryId = inventoryId;
	}

	
	
}
