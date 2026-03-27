package parktiket;

public class Parkhaus {

	public static void main(String[] args) {
		
		Ticket[] array = new Ticket[3];
		
		array[0] = new Ticket("Goethe", "Kutsche");
		array[1] = new Ticket("Schiller", "Pferd");
		array[2] = new Ticket("Herder", "Sänfte");
		
		for(int i=0; i<Ticket.cTicket ; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("Es wurden " + Ticket.cTicket + " Tickets ausgestellt.");

	}

}
