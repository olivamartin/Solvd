package army;

public class AssaultRifle {
	
	private int magazineCapacity;
	private int range;
	
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
	
	public AssaultRifle() {}
	
	public AssaultRifle(int magazineCapacity, int range) {
		this.magazineCapacity = magazineCapacity;
		this.range = range;
	}
	
	
	

}
