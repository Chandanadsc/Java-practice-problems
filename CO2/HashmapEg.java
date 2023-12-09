package CO2;
import java.util.*;
//public class HashmapEg {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//HashMap <String,String> hp=new HashMap<>();
//hp.put("bookid1","book1");
//hp.put("bookid2","book2");
//hp.put("bookid3","book3");
//hp.put("bookid4","book4");
//System.out.println(hp);
//Set <String> b =hp.keySet();
//
//for(String i: b) {
//	System.out.println(hp.get(i));
//}
//
//	}
//
//}
public class HashmapEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap <String,Integer> hp=new HashMap<>();
hp.put("emp1",50000);
hp.put("emp2",30000);
hp.put("emp3",60000);
hp.put("emp4",40000);
System.out.println(hp);
Set <String> b = hp.keySet();
int a= hp.get("emp1");
for (Map.Entry<String, Integer> e : hp.entrySet())
    System.out.println("Key: " + e.getKey()
                       + " Value: " + e.getValue());
	
	

             
}
	

	
}
	

