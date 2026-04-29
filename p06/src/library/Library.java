package library;

public class Library {
	
	private String name;
	
	//Innere Klasse
    private static class Book {
    	
    	String title;
    	String author;
    	
    	Book(String title, String author) {
    		this.title = title;
    		this.author = author;
    		
    	}
    	
    	public void printBook() {
			System.out.println(title + " von " + author);
		}
    }
    
    //Main-Methode
    public static void main(String[] args) {
        Library lib = new Library("Stadtbibliothek");
        lib.printLibrary();
        
        addSampleBook();
    }

    //Eine Library erstellen
    public Library(String name) {
        this.name = name;
    }
    
    //Buch hinzufügen
    public static void addSampleBook() {
    	
    	Library.Book b = new Library.Book("Faust", "Goethe");
    	b.printBook();
    }

    //Library ausgeben
    public void printLibrary() {
        System.out.println("Bibliothek: " + name);
                
        //Innere Klasse innerhalb einer Methode
        class Adress {
        	String city;
        	
        	Adress (String city) {
        		this.city = city;
        	}
        	
        	void printAdress() {
        		System.out.println("Standort: " + city);
        	}
        }
        
        Adress a = new Adress("Köln");
        a.printAdress();
    }
}