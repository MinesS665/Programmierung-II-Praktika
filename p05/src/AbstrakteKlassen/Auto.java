package AbstrakteKlassen;

public class Auto extends Fahrzeug{

	Auto (String company, int speed) {
		super(company, speed);
	}
	
	public void accelerate(int value) {
		speed += value;
	}
}
