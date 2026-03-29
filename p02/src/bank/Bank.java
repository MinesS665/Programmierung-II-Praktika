package bank;

public class Bank {

	public static void main(String[] args) {
		Kunde c1 = new Kunde("Goethe");
		Kunde c2 = new Kunde("Herder");
		Kunde c3 = new Kunde("Schiller");
		
		Konto k1 = new Konto(2.58f, c3);
		Konto k2 = new Konto(12849, c2);
		Konto k3 = new Konto(680.10f, c1);
		
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(k3);
		
		Transfer(k2, k1, 5.12f);
		
	}
	
	public static void Transfer(Konto k1, Konto k2, float money) {
		
		System.out.println("Überweise " + money + " von " + k1.customer.getName() + " zu " + k2.customer.getName() + ".");
		
		k1.transfer(-money);
		k2.transfer(money);
	}

}
