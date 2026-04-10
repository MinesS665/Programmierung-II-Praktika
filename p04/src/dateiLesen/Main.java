package dateiLesen;

import java.util.Scanner;
import java.lang.AutoCloseable;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) {
		
		try {
			
			readFile("text.txt");
			
		} catch (FileNotFoundException e) {
			System.out.println("Datei konnte nicht gefunden werden");
		}

	}
	
	public static void readFile(String name) throws FileNotFoundException {
		
		File file = new File(name);
		Scanner scanner = new Scanner(file);
		String tmp;
		
		while (scanner.hasNextLine()) {
			tmp = scanner.nextLine();
			System.out.println(tmp);
		}
			
		scanner.close();
	} 

}
