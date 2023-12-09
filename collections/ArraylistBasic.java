package collections;
import java.util.*;
public class ArraylistBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
  ArrayList<String> s1=new ArrayList<String>();
  s1.add("Hello");
  s1.add("My");
  s1.add("Name");
  s1.add("is");
  s1.add("Chandana");
  System.out.println("Array list is"+s1);
  String s=s1.get(2);
  System.out.println(s);
  int index=s1.indexOf("Chandana");
  s1.sort(null);
  System.out.println(s1);
  s1.removeAll(s1);
  System.out.println(s1);
	}
	

}
