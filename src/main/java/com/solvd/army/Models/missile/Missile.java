package com.solvd.army.Models.missile;

import com.solvd.army.Models.interfaces.IExplosives;

public class Missile implements IExplosives {
	
	private int speed;
	private int range;
	private int blastRadius;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public int getBlastRadius() {
		return blastRadius;
	}
	public void setBlastRadius(int blastRadius) {
		this.blastRadius = blastRadius;
	}
	
	public Missile() {}
	
	public Missile(int speed, int range, int blastRadius) {
		this.speed = speed;
		this.range = range;
		this.blastRadius = blastRadius;
	}
	
	public String countdown(int time) {
		long start = System.currentTimeMillis();
		long end = start + time*1000; // time in seconds * 1000 ms/sec
		while (System.currentTimeMillis() < end){}
		return "Kaboom" ;
	}
	
	public int damage(int radius, int type) {
		return (radius^2)*type;
	}
	
	

	
}
