package bibliothek;

public class Buch {
	private String titel;
	private String autor;
	private int bookID;
	private static int cBooks = 0;

	public Buch(String titel, String autor) {
		
		cBooks +=1;
		bookID = cBooks;
		
		this.titel = titel;
		this.autor = autor;
	}
	
	void output() {
		System.out.println(titel + " von " + autor + " ist Buch " + bookID + "/" + cBooks);
	}
	
	public static int getcBooks() {
		return cBooks;
	}
}
