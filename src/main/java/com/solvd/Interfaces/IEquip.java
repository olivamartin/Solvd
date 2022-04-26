package com.solvd.Interfaces;
import com.solvd.army.Models.weapon.Weapon;


@FunctionalInterface
public interface IEquip<P> {
    public void giveWeapon(P person, Weapon w);
}
