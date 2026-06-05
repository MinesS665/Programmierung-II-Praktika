package objectstreams;

import java.io.Serializable;

public class Student implements Serializable {
	
	public String name;
	public int alter;
	
	public Student(String name, int alter) {
		
		this.name = name;
		this.alter = alter;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", alter=" + alter + "]";
	}
	
}
