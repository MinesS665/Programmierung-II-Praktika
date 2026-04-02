package fahrzeuge;

public class Auto extends Fahrzeug {
	int anzTueren;
	
	public Auto (int anzTueren, String marke, int geschwindigkeit) {
		
		super(marke, geschwindigkeit);
		this.anzTueren = anzTueren;
	}
	
	void anzeigen() {
		super.anzeigen();
		System.out.println(" und besitzt " + anzTueren + " Türen");
	}
	
}
