
public class Main {

	public static void main(String[] args) {
		
		Konto k1 = new Konto();
		
		try {
			k1.abheben(250);
			k1.abheben(1000);
		} catch (UngueltigerBetragException e) {
			System.out.println(e);
		}
	}

}
