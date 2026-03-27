package bank;

public class Kunde {
	
	int ID;
	static int cCustomer = 0;
	String name;
	
	public Kunde(String name) {
		
		cCustomer++;
		ID = cCustomer;
		this.name = name;
	}
	
}
