package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Diana");
		names.add("Sarah");
		names.add("Olaf");
		names.add("Samira");
		names.add("Leona");
		
		Output(names);
		
		Random random = new Random();
		int x = random.nextInt(5);
		
		System.out.println(names.get(x) + " wird entfernt...");
		names.remove(x);
		
		Output(names);
		
		x = random.nextInt(4);
		
		if (names.contains(names.get(x))) System.out.println(names.get(x) + " ist enthalten.");
		else System.out.println("Gesuchter String nicht enthalten");
		
		Collections.sort(names);
		
		Output(names);

	}
	
	static void Output(ArrayList<String> names) {
		for (String n : names) {
			System.out.println(n);
		}
	}

}
