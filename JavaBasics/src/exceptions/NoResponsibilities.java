package exceptions;
import army.Division;

@SuppressWarnings("serial")

public class NoResponsibilities extends Exception {
	
	public NoResponsibilities(String errorMessage) {
		super(errorMessage);		
	}

}
