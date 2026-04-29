package firma;

public class Manager extends Mitarbeiter{

	String abteilung;
	
	Manager(String name, double gehalt, String abteilung) {
		super(name, gehalt);
		this.abteilung = abteilung;
	}
	
	Manager(String name, String abteilung) {
		super(name);
		this.abteilung = abteilung;
		bonus = bonus();
	}
	
	double bonus() {
		
		double extra = gehalt * 0.2f;
		return extra;
	}
	
	void anzeigen() {
		System.out.println(name + " bekommt " + gehalt + "+" + bonus + "€ und arbeitet in " + abteilung);
	}
}
