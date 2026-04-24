package shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ShopApp {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 999.99));
        products.add(new Product("Maus", 19.99));
        products.add(new Product("Tastatur", 49.99));

        Collections.sort(products, new Comparator<Product>() {
        	
        	@Override
        	public int compare(Product a, Product b) {
        		return Double.compare(a.getPrice(), b.getPrice());
        	}
        });
        
        // Ausgabe 1:
        System.out.println("Sortiert nach Preis:");
        for (Product p : products) {
            System.out.println(p);
        }
        
        // TODO: Sortierung nach Name

        // Ausgabe 2:
        System.out.println("\nSortiert nach Name:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}