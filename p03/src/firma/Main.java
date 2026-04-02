package firma;

public class Main {

	public static void main(String[] args) {
		
		Mitarbeiter[] mitarbeiter = new Mitarbeiter[4];
		
		mitarbeiter[0]= new Mitarbeiter("Wendy", 3400);
		mitarbeiter[1]= new Mitarbeiter("Bob");
		mitarbeiter[2]= new Manager("Steffi", "Planung");
		mitarbeiter[3] = new Manager("Ari", 5000,"Planung");
		
		for (Mitarbeiter m : mitarbeiter) {
			m.anzeigen();
		}

	}

}
