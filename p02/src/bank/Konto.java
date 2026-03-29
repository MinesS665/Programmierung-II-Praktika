package bank;

public class Konto {
	
	float money;
	Kunde customer;
	
	public Konto(float money, Kunde customer) {
		this.money = money;
		this.customer = customer;
	}
	
	public void transfer(float money) {
		
		this.money += money;
		
	}
	
	public String toString() {
		
		return customer.getName() + " hat " + money + "€ auf seinem Konto."; 
	}
}
