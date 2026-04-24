package javadocTest;

/**
 * Enthält Main Methode zum Programmstart.
 */

public class CalculatorApp {

	/**
	 * Die Main-Mathode ruft entsprechende Methoden und Klassen auf um Summe, Produkt und Durchschnitt zweier Zahlen ermittelt.
	 * Alle Ergebnisse werden anschließend nacheinander ausgegeben.
	 * @param args Eingabestring
	*/
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum = calc.add(5, 3);
        int product = calc.multiply(5, 3);
        double avg = calc.average(5, 3);

        printResult("Summe", sum);
        printResult("Produkt", product);
        printResult("Durchschnitt", avg);
    }
    
    /**
     * Die Methode dient der Ausgabe des Ergebnisses. Die Ausgabe erfolgt in der Form <Operation>: <Ausgabe>.
     * @param label Ausgeführte Operation
     * @param value Wert des Ergebnis.
	*/
    public static void printResult(String label, double value) {
        System.out.println(label + ": " + value);
    }
}