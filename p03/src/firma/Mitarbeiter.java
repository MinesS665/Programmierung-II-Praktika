package firma;

public class Mitarbeiter {
	String name;
	double gehalt;
	double bonus;
	
	
	Mitarbeiter (String name, double gehalt) {
		this.name = name;
		this.gehalt = gehalt;
		bonus = bonus();
	}
	
	Mitarbeiter (String name) {
		this.name  = name;
		gehalt = 3000;
	}
	
	double bonus() {
		
		double extra = gehalt * 0.1;
		
		return extra;
	}
	
	void anzeigen() {
		System.out.println(name + " bekommt " + gehalt + "+" + bonus + "€");
	}

}
