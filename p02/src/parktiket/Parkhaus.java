package parktiket;

import java.util.Scanner;

public class Parkhaus {

	public static void main(String[] args) {
		
		Ticket[] array = new Ticket[3];
		
		array[0] = new Ticket("Goethe", "Kutsche");
		array[1] = new Ticket("Schiller", "Pferd");
		array[2] = new Ticket("Herder", "Sänfte");
		
		Output(array);
		
		Payment(array);
		
		Output(array);

	}
	
	public static void Payment(Ticket[] array) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Wer hat sein Ticket bezahlt?");
		
		for (Ticket ticket : array) {
			
			System.out.println(ticket.getID() + " - " + ticket.getOwner());
		}
		
		System.out.print("Fahrer-ID eigeben: ");
		
		int ID = input.nextInt();
		
		for (Ticket ticket : array) {
			
			if (ticket.getID() == ID) {
				ticket.setPaid();
			}
		}
		
		input.close();
	}
	
	public static void Output(Ticket[] array) {
		
		System.out.println("Noch zu zahlende Tickets:");
		
		for(int i=0; i<Ticket.getcTicket() ; i++) {
			
			if(array[i].isPaid() == false) {
				
				System.out.println(array[i]);
			}
		}
		
		System.out.println("Es wurden " + Ticket.getcTicket() + " Tickets ausgestellt.");
	}

}
