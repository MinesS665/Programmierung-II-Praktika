package HashMap;

import java.util.HashMap;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		HashMap<String, Integer> cart = new HashMap<>();
		
		cart.put("Sushi", 6);
		cart.put("Kakao", 2);
		cart.put("Apfel", 2);
		cart.put("Käse", 1);
		cart.put("Nudeln", 3);

		Output(cart);
		
		cart.replace("Nudeln", cart.get("Nudeln"), cart.get("Nudeln")+1);
		
		Output(cart);
		
		System.out.println("Es befinden sich " + Amount(cart) + " Artikel im Warenkorb");
	}
	
	static int Amount(HashMap<String, Integer> cart) {
		
		int a = 0;
		Set<String> keys = cart.keySet();
		for (String i : keys) {
			a+=cart.get(i);
		}
		
		return a;
	}
	
	static void Output(HashMap<String, Integer> cart) {
		System.out.println(cart);
	}

}
