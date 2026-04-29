package parktiket;

public class Ticket {
	
	private int ID;
	private String owner;
	private String model;
	private boolean isPaid = false;
	
	private static int cTicket = 0;
	
	public Ticket(String owner, String model) {
		
		cTicket++;
		ID = cTicket;
		this.owner = owner;
		this.model = model;
	}
	
	public String toString() {
		return owner + " hat " + model + " falsch abgestellt und muss Ticket " + ID + " bezahlen."; 
	}

	public void setPaid() {
		this.isPaid = true;
	}

	public boolean isPaid() {
		return isPaid;
	}

	public int getID() {
		return ID;
	}

	public String getOwner() {
		return owner;
	}

	public static int getcTicket() {
		return cTicket;
	}

	public static void setcTicket(int cTicket) {
		Ticket.cTicket = cTicket;
	}
	
	

}
