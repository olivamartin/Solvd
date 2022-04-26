package com.solvd.army.Models.ammo;

import com.solvd.army.Models.ammo.ammoCaliber.AmmoCaliber;
import com.solvd.army.Models.ammo.ammoType.AmmoType;

public class Ammo {
	
	private AmmoType type;
	private AmmoCaliber caliber;

	public AmmoType getType() {
		return this.type;
	}

	public void setType(AmmoType type) {
		this.type = type;
	}

	public AmmoCaliber getCaliber() {
		return this.caliber;
	}

	public void setCaliber(AmmoCaliber type) {
		this.caliber = caliber;
	}
	
	public Ammo() {}
	
	public Ammo(AmmoType type, AmmoCaliber caliber) {
		this.type = type;
		this.caliber = caliber;
	}

}
