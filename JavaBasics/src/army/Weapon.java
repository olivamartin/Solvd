package army;

public abstract class Weapon {
	
	private int magazineCapacity;
	private int range;
	private int weight;
	
	public int getMagazineCapacity() {
		return magazineCapacity;
	}
	public void setMagazineCapacity(int magazineCapacity) {
		this.magazineCapacity = magazineCapacity;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public Weapon() {}
	
	public Weapon(int magazineCapacity, int range, int weight) {
		this.magazineCapacity = magazineCapacity;
		this.range = range;
		this.weight = weight;
	}

}
