package army;

public class Helicopter {
	
	private int numberOfRotors;
	private int fuelCapacity;
	
	public int getNumberOfRotors() {
		return numberOfRotors;
	}
	public void setNumberOfRotors(int numberOfRotors) {
		this.numberOfRotors = numberOfRotors;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	
	public Helicopter() {}
	
	public Helicopter(int numberOfRotors, int fuelCapacity) {
		this.numberOfRotors = numberOfRotors;
		this.fuelCapacity = fuelCapacity;
	}
	
	

	
}
