package army;

public class Tank extends Vehicle {
	
	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Tank() {
		super();
	}
	
	public Tank(int maxSpeed, int capacity, int fuelCapacity, String type) {
		super(maxSpeed, capacity, fuelCapacity);
		this.type = type;
	}
	
	

}
