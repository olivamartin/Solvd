package com.solvd.JavaBasics;

import java.util.Objects;

public class Bicycle {
    
    private int cadence;
    private int gear;
    private int speed;
        
    
    public Bicycle() {}

	public Bicycle(int startCadence, int startSpeed, int startGear){
    	this.cadence = startCadence;
    	this.gear = startGear;
        this.speed = startSpeed;
    }

	public int getCadence() {
		return cadence;
	}

	public void setCadence(int cadence) {
		this.cadence = cadence;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cadence, gear, speed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bicycle other = (Bicycle) obj;
		return cadence == other.cadence && gear == other.gear && speed == other.speed;
	}

	@Override
	public String toString() {
		return "Bicycle [cadence=" + cadence + ", gear=" + gear + ", speed=" + speed + "]";
	}
	
	

  
       
}