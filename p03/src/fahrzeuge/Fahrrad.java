package fahrzeuge;

public class Fahrrad extends Fahrzeug {
	
	boolean hatKlingel;

	public Fahrrad (boolean hatKlingel, String marke, int geschwindigkeit) {
		
		super(marke, geschwindigkeit);
		this.hatKlingel = hatKlingel;
	}
	
	void anzeigen() {
		super.anzeigen();
		
		if (hatKlingel == true) {
			System.out.println(" und hat eine Klingel");
		} else
			System.out.println(" und hat keine Klingel");
		
	}
	
}
