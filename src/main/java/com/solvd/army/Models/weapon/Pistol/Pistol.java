package com.solvd.army.Models.weapon.Pistol;

import com.solvd.army.Models.weapon.Weapon;

public class Pistol extends Weapon {
	
	private String pistolType;
	
	public String getPistolType() {
		return pistolType;
	}
	public void setPistolType(String pistolType) {
		this.pistolType = pistolType;
	}
	public Pistol() {
		super();
	}
	
	public Pistol(int magazineCapacity, int range, int weight, String pistolType) {
		super(magazineCapacity, range, weight);
		this.pistolType = pistolType;
	}
	
	

	
}
