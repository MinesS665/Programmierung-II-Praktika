package auf3;

public class Main {

	public static void main(String[] args) {
		
		Rabatt studRab = preis -> {
			return preis -preis * 0.1;
		};

		Rabatt mitRab = preis -> {
			return preis - preis * 0.25;
		};
		
		double preis = 200;
		System.out.println("Originalpreis: " + preis);
		System.out.println("Studentenpreis " + studRab.berechnePreis(preis));
		System.out.println("Mitarbeiterpreis: " + mitRab.berechnePreis(preis));
	}

}
