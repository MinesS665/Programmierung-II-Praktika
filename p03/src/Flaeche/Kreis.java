package Flaeche;

public class Kreis extends Form{
	double pi = 3.141592654;
	double r;
	
	
	Kreis(String name, double r) {
		super(name);
		this.r = r;
		a = flaeche();
	}
	
	double flaeche() {
		double a = pi * r * r;
		
		return a;
	}
	
	void anzeigen() {
		System.out.println(name + " ist ein Keis mit einem Flächeninhalt von " + a + "FE" );
	}
}
