package army;

public class Division {

	private String name;
	private String responsabilities;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResponsabilities() {
		return responsabilities;
	}
	public void setResponsabilities(String responsabilities) {
		this.responsabilities = responsabilities;
	}
	
	public Division() {}
	
	public Division(String name, String responsabilities) {
		this.name = name;
		this.responsabilities = responsabilities;
	}
	
	
	
}
