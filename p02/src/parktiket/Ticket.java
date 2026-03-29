package parktiket;

public class Ticket {
	
	private int ID;
	private String owner;
	private String model;
	private boolean isPaid = false;
	
	static int cTicket = 0;
	
	public Ticket(String owner, String model) {
		
		cTicket++;
		ID = cTicket;
		this.owner = owner;
		this.model = model;
	}
	
	public String toString() {
		return owner + " hat " + model + " falsch abgestellt und muss Ticket " + ID + " bezahlen."; 
	}

	public void setPaid(boolean isPaid) {
		this.isPaid = true;
	}

}
