package CO2;
//import java.util.*;  
//class MapExample3{  
// public static void main(String args[]){  
//Map<Integer,String> map=new HashMap<Integer,String>();          
//      map.put(100,"Amit");    
//      map.put(101,"Vijay");    
//      map.put(102,"Rahul");   
//             
//      map.entrySet()  
//      
//      .stream()  
//     
//      .sorted(Map.Entry.comparingByKey())  
//    
//      .forEach(System.out::println);  
// }  
//}  
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Stream;

class HashMapSortng{
	
	public static void main(String args[])
	{
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(100, "vijay");
		map.put(101, "chandana");
		map.put(102, "saisree");
		
		 map.entrySet()  
	      
	      .stream()  
	     
	      .sorted(Map.Entry.comparingByValue())  
	    
	      .forEach(System.out::println);  
	}
}
//import java.util.*;  
//class MapExample4{  
// public static void main(String args[]){  
//Map<Integer,String> map=new HashMap<Integer,String>();          
//      map.put(100,"Amit");    
//      map.put(101,"Vijay");    
//      map.put(102,"Rahul");    
//      //Returns a Set view of the mappings contained in this map    
//      map.entrySet()  
//      //Returns a sequential Stream with this collection as its source  
//      .stream()  
//      //Sorted according to the provided Comparator  
//      .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))  
//      //Performs an action for each element of this stream  
//      .forEach(System.out::println);  
// }  
//}  