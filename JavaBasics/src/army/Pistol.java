package army;

public class Pistol {
	
	private int magazineCapacity;
	private String name;
	private String type;
	
	public int getMagazineCapacity() {
		return magazineCapacity;
	}
	public void setMagazineCapacity(int magazineCapacity) {
		this.magazineCapacity = magazineCapacity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Pistol() {}
	
	public Pistol(int magazineCapacity, String name, String type) {
		this.magazineCapacity = magazineCapacity;
		this.name = name;
		this.type = type;
	}
	
	

	
}
