package army;

public class MilitaryAircraft {
	
	private int maxSpeed;
	private String type;
	private int numberOfEngines;
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
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
	
	public MilitaryAircraft() {}
	
	public MilitaryAircraft(int maxSpeed, String type, int numberOfEngines) {
		this.maxSpeed = maxSpeed;
		this.type = type;
		this.numberOfEngines = numberOfEngines;
	}
	
	
	

}
