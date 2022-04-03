package exceptions;
@SuppressWarnings("serial")

public class WeaponTooHeavy extends RuntimeException {
	
	public WeaponTooHeavy(String errorMessage) {
		super(errorMessage);
	}
	
	}



