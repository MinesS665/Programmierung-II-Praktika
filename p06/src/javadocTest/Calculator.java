package javadocTest;

/**
 * Stellt grundlegenede Rechenoperationen bereit.
 */
public class Calculator {

	/**
	 * Die Methode dient der Addition zweier Zahlen. Sie arbeitet ganzzahlig.
	 * @param a Erster Summand
	 * @param a Zweiter Summand
	 * @return Ergebnis (Summe)
	*/
    public int add(int a, int b) {
        return a + b;
    }

    /**
	 * Die Methode dient der Multiplikation zweier Zahlen. Sie arbeitet ganzzahlig.
	 * @param a Erster Faktor
	 * @param a Zweiter Faktor
	 * @return Ergebnis (Produkt)
	*/
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
	 * Die Methode dient der Bildung des arithmetisches Mittels zweier Zahlen. Sie arbeitet ganzzahlig.
	 * @param a Erste Zahl
	 * @param a Zweite Zahl
	 * @return Ergebnis (Mittel)
	*/
    public double average(int a, int b) {
        return (a + b) / 2.0;
    }
}