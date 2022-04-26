package com.solvd.Interfaces;

import com.solvd.army.Models.ammo.Ammo;
import com.solvd.army.Models.ammo.ammoCaliber.AmmoCaliber;

@FunctionalInterface
public interface ICaliber<R> {
    public void changeCaliber(Ammo a, AmmoCaliber ac, R receptor);
}
