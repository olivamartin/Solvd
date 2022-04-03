package exceptions;
@SuppressWarnings("serial")

public class NoTimeExplosive extends RuntimeException {
	
	public NoTimeExplosive(String errorMessage){
		super(errorMessage);
	}

}
