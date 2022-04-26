package com.solvd.Interfaces;

@FunctionalInterface
public interface IGive<G,T,R> {
    public void giveWeapon(G giver, T thing, R receiver);
}
