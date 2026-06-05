package lesen;

import java.io.*;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<GPSPoint> coordinates = new ArrayList<>();
		
		try (BufferedReader reader = new BufferedReader (new FileReader (new File("./data/GPS.txt")))) {
			
			String line;
			
			while ((line = reader.readLine()) != null) {
				String[] tmp = line.split(";");
				
				GPSPoint g = new GPSPoint(Double.parseDouble(tmp[0]), Double.parseDouble(tmp[0]));
				
				coordinates.add(g);
				
			}
		} catch (IOException e) {}

		System.out.println(coordinates);
		
	}

}












