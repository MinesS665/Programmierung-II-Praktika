package InterfaceComparable;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Student[] studenten = {
				new Student("Anna", 12345, 1.7),
				new Student("Ben", 23456, 2.3),
				new Student("Clara", 34567, 1.7),
				new Student("David", 45678, 1.3)
		};
		Arrays.sort(studenten);
		for (Student s : studenten) {
			System.out.println(s);
		}
	}
	
}
