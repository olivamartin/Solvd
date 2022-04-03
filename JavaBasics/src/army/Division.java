package army;

public class Division {

	private String name;
	private String responsibilities;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResponsabilities() {
		return responsibilities;
	}
	public void setResponsabilities(String responsabilities) {
		this.responsibilities = responsabilities;
	}
	
	public Division() {}
	
	public Division(String name, String responsabilities) {
		this.name = name;
		this.responsibilities = responsabilities;
	}
	
	
	
}
