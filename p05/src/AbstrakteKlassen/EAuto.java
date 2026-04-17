package AbstrakteKlassen;

public class EAuto extends Auto implements Elektrisch {
	
	int capacity;
	int akku;
	
	EAuto (String company, int speed, int capacity) {
		super(company, speed);
		this.capacity = capacity;
		akku = 150;
	}
	
	@Override
	public void charge (int watts, int time) {
		
		while (akku <= capacity) 
		akku += watts * time;
	}
	
	@Override
	public void display() {
		
		System.out.println(company + ", " + speed + "km/h, " + akku/capacity);
	 }

}
