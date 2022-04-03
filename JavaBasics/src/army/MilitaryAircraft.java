package army;

public class MilitaryAircraft extends Vehicle {
	

	private String type;
	private int numberOfEngines;

	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNumberOfEngines() {
		return numberOfEngines;
	}
	public void setNumberOfEngines(int numberOfEngines) {
		this.numberOfEngines = numberOfEngines;
	}
	
	public MilitaryAircraft() {
		super();
	}
	
	public MilitaryAircraft(int maxSpeed, int capacity, int fuelCapacity, String type, int numberOfEngines) {
		super(maxSpeed, capacity, fuelCapacity);
		this.type = type;
		this.numberOfEngines = numberOfEngines;
	}
	
	
	

}
