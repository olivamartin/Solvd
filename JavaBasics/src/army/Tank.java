package army;

public class Tank {
	
	private String type;
	private int maxSpeed;
	private int capacity;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public Tank() {}
	
	public Tank(String type, int maxSpeed, int capacity) {
		this.type = type;
		this.maxSpeed = maxSpeed;
		this.capacity = capacity;
	}
	
	

}
