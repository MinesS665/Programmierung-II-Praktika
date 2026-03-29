package bibliothek;

public class Bibliothek {

	public static void main(String[] args) {
		
		Buch b1 = new Buch("Faust", "Goethe");
		Buch b2 = new Buch("Momo", "Michael Ende");
		
		b1.output();
		b2.output();
		
		System.out.println("Es gibt " + Buch.getcBooks() + " Bücher.");

	}

}
