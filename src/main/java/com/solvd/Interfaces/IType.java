package com.solvd.Interfaces;

import com.solvd.army.Models.ammo.Ammo;
import com.solvd.army.Models.ammo.ammoType.AmmoType;
import com.solvd.army.Models.weapon.Weapon;

@FunctionalInterface
public interface IType {
    public void changeType(AmmoType at, Ammo a, Weapon w);
}
