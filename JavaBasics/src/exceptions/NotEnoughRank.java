package exceptions;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import army.Officer;

@SuppressWarnings("serial")
public class NotEnoughRank extends Exception {
	
	
	
	public NotEnoughRank(String errorMessage) {
		super(errorMessage);
	}

}
