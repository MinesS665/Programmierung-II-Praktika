package Flaeche;

public class Rechteck extends Form {

	double b;
	double h;
	
	Rechteck(String name, double b, double h) {
		super(name);
		
		this.b = b;
		this.h = h;
		a = flaeche();
				
	}
	
	double flaeche() {
		
		double a = b * h;
		
		return a;
	}
	
	void anzeigen() {
		System.out.println(name + " ist ein Rechteck mit einem Flächeninhalt von " + a + "FE" );
	}
}
