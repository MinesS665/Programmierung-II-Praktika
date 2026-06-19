package auf4;

public class Main {

	public static void main(String[] args) {
		
		Text makeUpper = text -> {
			return text = text.toUpperCase() + " " + text.length();
		};
		
		System.out.println(makeUpper.refactor("Hallo Welt"));
	}

}
