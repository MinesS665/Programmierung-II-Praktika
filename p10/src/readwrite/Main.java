package readwrite;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		
		String text = "";
		System.out.println(1);
		
		try (InputStream input = new FileInputStream(new File("./data/text.txt"))) {
			
			int c;
			
			while((c = input.read()) != -1) {
				
				if (c >= 'a' && c <= 'z') c = (char) (c - 32);
				
				text += (char) c;
			}
			
		} catch (IOException e) {System.out.println("Input Fehlt");}
	
		try (OutputStream output = new FileOutputStream(new File("./data/TEXT.txt"), true)) {
			
			output.write(text.getBytes());
			
		} catch (IOException e) {}
	}

}

















