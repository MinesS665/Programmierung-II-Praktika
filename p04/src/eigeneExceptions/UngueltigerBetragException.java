package eigeneExceptions;

public class UngueltigerBetragException extends Exception{

	public UngueltigerBetragException() {
		super("Ungültiger Betrag");
	}
	
	public UngueltigerBetragException(String message) {
		super(message);
	}
}
