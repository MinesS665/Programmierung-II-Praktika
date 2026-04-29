package Flaeche;

public class Main {

	public static void main(String[] args) {
		
		Form[] formen = new Form[4];
		
		formen[1] = new Kreis("k1", 4);
		formen[2] = new Form("k2");
		formen[3] = new Kreis("k3", 0.5);
		formen[0] = new Rechteck("k4", 4, 5);
		
		for (Form f : formen) {
			f.anzeigen();
		}

	}

}
