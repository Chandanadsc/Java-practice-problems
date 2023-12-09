package week9;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Supermarket {
    public static void main(String[] args) {
        LinkedList<Item> itemsList = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int numItems = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < numItems; i++) {
            System.out.println("Enter details for item " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("ID: ");
            int id = scanner.nextInt();
            System.out.print("Cost: $");
            double cost = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            Item item = new Item(name, id, cost);
            itemsList.add(item);
        }

        System.out.println("\nItems List (Original Order):");
        displayItems(itemsList);

        // Sort items in ascending order of cost using Collections.sort() and Comparable interface
        
        System.out.println("\nItems List (Descending Order of Cost):");
        Collections.sort(itemsList);
        displayItems(itemsList);
        scanner.close();
    }

    public static void displayItems(LinkedList<Item> itemsList) {
        if (itemsList.isEmpty()) {
            System.out.println("No items available.");
        } else {
            for (Item item : itemsList) {
                System.out.println(item);
            }
        }
    }
}