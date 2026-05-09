package Performance;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> aList = new ArrayList<>();
		LinkedList<Integer> lList = new LinkedList<>();
		int tmp;
		
		long t1;
		long t2;
		long firstInsertAList;
		long firstInsertLList;
		long addFrontAList;
		long addFrontLList;
		long middleAList;
		long middleLList;
		
		t1=System.nanoTime();
		for (int i = 1; i<=100000; i++) {
			aList.add(i);
		}
		t2=System.nanoTime();
		firstInsertAList = t2-t1;
		
		
		t1=System.nanoTime();
		for (int i = 1; i<=100000; i++) {
			lList.add(i);
		}
		t2=System.nanoTime();
		firstInsertLList = t2-t1;
		
		
		t1=System.nanoTime();
		for (int i = 1; i<=100000; i++) {
			aList.addFirst(i);
		}
		t2=System.nanoTime();
		addFrontAList = t2-t1;
		
		
		t1=System.nanoTime();
		for (int i = 1; i<=100000; i++) {
			lList.addFirst(i);
		}
		t2=System.nanoTime();
		addFrontLList = t2-t1;
		
		
		t1=System.nanoTime();
		tmp = aList.get(100000);
		t2=System.nanoTime();
		middleAList = t2-t1;
		
		t1=System.nanoTime();
		tmp = lList.get(100000);
		t2=System.nanoTime();
		middleLList = t2-t1;
		
		System.out.println("100.000 Elemente am Ende einfügen:");
		System.out.println("	ArrayList:	" + firstInsertAList);
		System.out.println("	LinkedList:	" + firstInsertLList);
		System.out.println("100.000 Elemente am Anfang einfügen:");
		System.out.println("	ArrayList:	" + addFrontAList);
		System.out.println("	LinkedList:	" + addFrontLList);
		System.out.println("Zugriff auf Element aus der Mitte:");
		System.out.println("	ArrayList:	" + middleAList);
		System.out.println("	LinkedList:	" + middleLList);
	}
	
}
