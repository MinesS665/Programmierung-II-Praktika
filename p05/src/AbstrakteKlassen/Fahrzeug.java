package AbstrakteKlassen;

abstract class Fahrzeug {

	protected String company;
	protected int speed;
	
	Fahrzeug (String company, int speed) {
		this.company = company;
		this.speed = speed;
	}
	
	public abstract void accelerate (int value);
	
	public void display() {
		System.out.println(company + ", " + speed + "km/h");
	}
}
