package auf5;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> namen = Arrays.asList("Peter","Anna","Max", "Clara" );
		
		namen.sort((s1, s2) -> s1.compareTo(s2));
		
		System.out.println(namen);
	}

}
