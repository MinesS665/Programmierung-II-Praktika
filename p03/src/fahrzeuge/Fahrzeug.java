package fahrzeuge;

public class Fahrzeug {
	
	String marke;
	int geschwindigkeit;

	Fahrzeug(String marke, int geschwindigkeit) {
		this.marke = marke;
		this.geschwindigkeit = geschwindigkeit;
	}
	
	void beschleunigt(int wert) {
		geschwindigkeit += wert;
	}
	
	void anzeigen() {
		System.out.print(marke + " fährt mit " + geschwindigkeit + "km/h");
	}
}
