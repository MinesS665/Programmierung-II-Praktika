package sichereDivision;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
//Gedanken: ist es sinnvoll die try-Statements zu teilen. Für die Übersichtlichkeit scheint es lesbarer, allerdings muss dafür die Variable divImpossible einegeführt werden.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
		boolean divImpossible = false;
		
		try {
			System.out.print("Erste Zahl eingeben: ");
			a = input.nextInt();
			System.out.print("Zweite Zahl eingeben: ");
			b = input.nextInt();
			
			input.close();
		} catch (InputMismatchException e1) {
			System.out.println("Ungültige Eingabe, bitte nur Ganzzahlen eingeben");
			divImpossible = true;
		}
		
		try {		
			
			if (divImpossible == false) {
				int res = a/b;
				System.out.println(a + ":" + b + "=" + res);
			}
			
		} catch (ArithmeticException e2) {
			System.out.println("Division durch 0. Berechnung nicht möglich.");
		
		}
	}
}
