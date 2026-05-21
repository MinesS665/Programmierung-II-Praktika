package klassenschablone;

public class Main {

	public static void main(String[] args) {
		
		Box<Object> bi = new Box<>(10);
		Box<String> bs = new Box<>("Hallo");
		Box<Double> bd = new Box<>(3.14);
		
		System.out.println(bi.getValue());
		System.out.println(bs.getValue());
		System.out.println(bd.getValue());

	}

}
