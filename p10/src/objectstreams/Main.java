package objectstreams;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		
		Student s = new Student("Maik", 20);
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./data/objects.dat"))) {

		    oos.writeObject(s);
		    System.out.println("geschrieben");

		} catch (IOException e) {
		    e.printStackTrace();
		}
	
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./data/objects.dat"));
			
			Student p = (Student) ois.readObject();
			
			ois.close();
			System.out.println(p);
			
		} catch (IOException | ClassNotFoundException e) {;}
		
		
	}

}
