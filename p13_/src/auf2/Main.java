package auf2;

public class Main{

	public static void main(String[] args) {
		
		Aktion aktion = text -> {
			System.out.println(text);
			System.out.println(text);
			System.out.println(text);
		};
		
		aktion.ausfuehren("Hello World");

	}

}
