package week6;
import java.util.*;

import java.io.*;
import java.lang.*;
import java.util.*;

class  ComparatorChecking{

// Main driver method
public static void main(String[] args)
{

 // Creating an empty ArrayList of Student type
 ArrayList<Student> ar = new ArrayList<Student>();

 // Adding entries in above List
 // using add() method
 ar.add(new Student1(111, "Mayank", "london"));
 ar.add(new Student1(131, "Anshul", "nyc"));
 ar.add(new Student1(121, "Solanki", "jaipur"));
 ar.add(new Student1(101, "Aggarwal", "Hongkong"));

 // Display message on console for better readability
 System.out.println("Unsorted");

 // Iterating over entries to print them
 for (int i = 0; i < ar.size(); i++)
   System.out.println(ar.get(i));

 // Sorting student entries by roll number
 Collections.sort(ar, new Sortbyroll());

 // Display message on console for better readability
 System.out.println("\nSorted by rollno");

 // Again iterating over entries to print them
 for (int i = 0; i < ar.size(); i++)
   System.out.println(ar.get(i));

 // Sorting student entries by name
 Collections.sort(ar, new Sortbyname());

 // Display message on console for better readability
 System.out.println("\nSorted by name");

 // // Again iterating over entries to print them
 for (int i = 0; i < ar.size(); i++)
   System.out.println(ar.get(i));
}
}
