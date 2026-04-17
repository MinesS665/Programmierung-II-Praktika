package AbstrakteKlassen;

public class Fahrrad extends Fahrzeug{

	Fahrrad (String company, int speed) {
		super(company, speed);
	}
	
	public void accelerate(int value) {
		speed += value/2;
	}
}