package eigeneExceptions;

import java.util.Scanner;

public class Konto {

	private float balance = 500;
	private String name;
	int id = 0;
	private static int accountCount = 0;

	public String getName() {
		return name;
	}

	Konto (String name, float balance) {
		accountCount++;
		id = accountCount;
		this.name = name;
		this.balance = balance;
	}
	Konto (String name) {
		accountCount++;
		id = accountCount;
		this.name = name;
		balance = 0;
	}
	
	public void add(Scanner input) throws UngueltigerBetragException {
		
		float tmpMoney = 0;
		
		System.out.println("Wie viel Geld soll eingezahlt werden?");
		tmpMoney = input.nextFloat();
		
		if (tmpMoney < 0) {
			throw new UngueltigerBetragException();
		}
		
		balance += tmpMoney;
	}
	
	public void substract(Scanner input) throws UngueltigerBetragException {
		
		float tmpMoney = 0;
		
		System.out.println("Wie viel Geld soll abgehoben werden?");
		tmpMoney = input.nextFloat();
		
		if (tmpMoney > balance) {
			
			throw new UngueltigerBetragException();
		}
	}
	
	public String toString() {
		return name + ", " + balance + "€";
	}
	
}
