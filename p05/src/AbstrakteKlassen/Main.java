package AbstrakteKlassen;

public class Main {

	public static void main(String[] args) {
		
		Auto car = new Auto("Ford", 0);
		Fahrrad bike = new Fahrrad("Scott", 25);
		EAuto ecar = new EAuto("Smart", 70, 2300);

		ecar.display();
		car.display();
		bike.display();
		
		car.accelerate(10);
		bike.accelerate(-5);
		ecar.accelerate(13);
		ecar.charge(250, 600);
		
		ecar.display();
		car.display();
		bike.display();
	}

}
