package army;

public class Grenade {
	
	private double blastRadius;
	private String type;
	
	public double getBlastRadius() {
		return blastRadius;
	}
	public void setBlastRadius(double blastRadius) {
		this.blastRadius = blastRadius;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Grenade() {}
	
	public Grenade(double blastRadius, String type) {
		this.blastRadius = blastRadius;
		this.type = type;
	}

	
	
	
}
