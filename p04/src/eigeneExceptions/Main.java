package eigeneExceptions;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main {
	
	static ArrayList <Konto> konto = new ArrayList<>();

	public static void main(String[] args) {
		
		Konto activeAccount = null;
		Scanner input = new Scanner(System.in);
		String response = null;
		
		do {
			if (input.hasNext()) {
				response = input.next();
			}
			
			switch (response) {
				case "new" -> createAccount(input);
				case "login" -> {
					try {
						activeAccount = logIn(input);
						System.out.println(activeAccount);
					} catch (NotFoundException e) {
						System.out.println(e);
					}
				}
				case "+" -> {
					try {
						activeAccount.add(input);
					} catch (UngueltigerBetragException e) {
						System.out.println(e);
					}
					System.out.println(activeAccount);
				}
				case "-" -> {
					try {
						activeAccount.substract(input);
					} catch (UngueltigerBetragException e) {
						System.out.println(e);
					}
					System.out.println(activeAccount);
				}
				default -> System.out.println("keine gültige Eingabe");
			}
		}
		while (!response.equals("fertig"));
		
		input.close();
		
	}

	public static void createAccount (Scanner input) {
		String response;
		
		System.out.println("Möchten Sie ein neues Konto eröffnen? [yes/no]");
		
		try {
			response = input.next();
			if (response != "yes") {
				System.out.println("Wer ist der Inhaber?");
				String name = input.next();
				System.out.println("Was ist der aktuelle Kontostand?");
				float balance = input.nextFloat();
				
				konto.add(new Konto(name, balance));
			} else System.out.println("Abgebrochen.");
			
		} catch (InputMismatchException e) {
			System.out.println("Keine gültige Eingabe.");
		}
	}
	
	public static Konto logIn(Scanner input) throws NotFoundException {
		
		String response = null;
		Konto foundKonto = null;
		
		try {
			System.out.println("Wie ist der Name?");
			response = input.next();
			
			for (Konto k : konto) {
				if (k != null && k.getName().equals(response)) {
					foundKonto = k;
					System.out.println("Auf Konto von " + response + " angemeldet");
					break;
				}
			}
			if (foundKonto == null) {
				throw new NotFoundException();
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Keine gültige Eingabe.");
		}
		
		return foundKonto;
	}
}
