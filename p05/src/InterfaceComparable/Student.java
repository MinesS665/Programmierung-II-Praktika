package InterfaceComparable;

public class Student implements Comparable<Student>{
	
	String name;
	int mtrNr;
	double grade;
	int aGrade = 0;

	Student (String name, int mtrNr, double grade) {
		aGrade ++;
		this.name = name;
		this.mtrNr = mtrNr;
		this.grade = (this.grade + grade)/aGrade;
	}
	
	public int compareTo(Student other) {
		
		int tmp = this.name.compareTo(other.name);
		
		return tmp;
	}
	
	public String toString() {
		return "(" + mtrNr + ") " +  name + ", " + grade;
	}
}
