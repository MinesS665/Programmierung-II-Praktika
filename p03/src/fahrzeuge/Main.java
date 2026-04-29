package fahrzeuge;

public class Main {

	public static void main(String[] args) {
		
		Auto a = new Auto (5, "Mazda", 57);
		Fahrrad f = new Fahrrad (false, "Rider", 60);
		
		a.anzeigen();
		f.anzeigen();

	}

}
