package com.solvd.army.Models.weapon.AssaultRifle;

import com.solvd.army.Models.weapon.Weapon;

public class AssaultRifle extends Weapon {
	
	private String rifleType;

	public String getRifleType() {
		return rifleType;
	}

	public void setRifleType(String rifleType) {
		this.rifleType = rifleType;
	}

	public AssaultRifle() {
		super();
	}

	public AssaultRifle(int magazineCapacity, int range, int weight, String rifleType) {
		super(magazineCapacity, range, weight);
		this.rifleType = rifleType;
	}

}
