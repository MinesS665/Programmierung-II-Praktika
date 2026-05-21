package methodenschablone;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(mini(5, 8.7));

	}
	
	public static <T extends Number> T mini(T x, T y) {
		
		if (x.doubleValue() <= y.doubleValue()) return x;
		else return y;
	}

}
