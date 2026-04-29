package eigeneExceptions;

public class NotFoundException extends Exception{
	
	public NotFoundException() {
		super("Konnte nicht gefunden werden");
	}
	public NotFoundException(String message) {
		super(message);
	}

}
