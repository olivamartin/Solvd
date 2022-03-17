package army;

public class Equipment {
	
	private double Weight;
	private String requiredLicense;
	private String type;
	
	public double getWeight() {
		return Weight;
	}
	public void setWeight(double weight) {
		Weight = weight;
	}
	public String getRequiredLicense() {
		return requiredLicense;
	}
	public void setRequiredLicense(String requiredLicense) {
		this.requiredLicense = requiredLicense;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Equipment() {}
	
	public Equipment(double weight, String requiredLicense, String type) {
		Weight = weight;
		this.requiredLicense = requiredLicense;
		this.type = type;
	}
	
	
	

}
