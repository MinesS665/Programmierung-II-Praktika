package sichereDivision;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
			int a = input.nextInt();
			int b = input.nextInt();
			
			input.close();
			
			int res = a/b;
			System.out.println(a + ":" + b + "=" + res);
			
		} catch (InputMismatchException e) {
			System.out.println("Ungültige Eingabe");
		} catch (ArithmeticException e) {
			System.out.println("Division durch 0");
		
		}

	}

}
