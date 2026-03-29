package bank;

public class Kunde {
	
	private int ID;
	private static int cCustomer = 0;
	private String name;
	
	public Kunde(String name) {
		
		cCustomer++;
		ID = cCustomer;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getcCustomer() {
		return cCustomer;
	}
	
	
	
}
