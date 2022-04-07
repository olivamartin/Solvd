package com.solvd.army.Models.grenade;

import com.solvd.army.Models.interfaces.IExplosives;

public class Grenade implements IExplosives {
	
	private double blastRadius;
	private String type;
	private int time;
	
	public double getBlastRadius() {
		return blastRadius;
	}
	public void setBlastRadius(double blastRadius) {
		this.blastRadius = blastRadius;
	}
	public String getType() {
		return type;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Grenade() {}
	
	public Grenade(double blastRadius, String type,int time) {
		this.blastRadius = blastRadius;
		this.type = type;
		this.time = time;
	}
	

	public String countdown(int time) {
		long start = System.currentTimeMillis();
		long end = start + time*1000; // time in seconds * 1000 ms/sec
		while (System.currentTimeMillis() < end){}
		return "Boom" ;
	}

	public int damage(int radius, int type) {
		return radius*type;
	}

	
	
	
}
