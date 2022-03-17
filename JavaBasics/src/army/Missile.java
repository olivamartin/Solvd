package army;

public class Missile {
	
	private int speed;
	private int range;
	private int blastRadius;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public int getBlastRadius() {
		return blastRadius;
	}
	public void setBlastRadius(int blastRadius) {
		this.blastRadius = blastRadius;
	}
	
	public Missile() {}
	
	public Missile(int speed, int range, int blastRadius) {
		this.speed = speed;
		this.range = range;
		this.blastRadius = blastRadius;
	}
	
	

	
}
