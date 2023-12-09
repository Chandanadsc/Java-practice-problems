package week7;
import java.util.*;
public class CountryVector {
public static void main(String args[])
   {
	Vector<String> s=new Vector<String>();
	//Develop a program to read the country names and store in a Vector and then perform the following menu 
	//driven operations. a) Search for a country name b) Sort based on country name
	s.add("India");
	s.add("China");
	s.add("USA");
	s.add("UK");
	s.add("Canada");
	s.add("Alaska");
	s.add("Mongolia");
	s.add("Korea");
	s.add("Vietnam");
	s.add("Singapoor");
	s.add("Thailand");
	s.add("Chile");
	s.add("Egypt");
	s.add("Pakisthan");
	s.add("Afghanisthan");
	s.add("Nepal");
	s.add("Japan");
	s.add("Srilanka");
	s.sort(null);
	System.out.println(s);
   }
}
