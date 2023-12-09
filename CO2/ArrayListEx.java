package CO2;
import java.util.Collections;

import java.util.List;  
import java.util.ArrayList;
public class ArrayListEx{  
 public static void main(String args[]){  
  List<String> al=new ArrayList<String>();  
  al.add("Mango");  
  al.add("Apple");  
  al.add("Banana");  
  al.add("Grapes");  
  Collections.sort(al);
  //accessing the element    
  System.out.println("Returning element: "+al.get(1));//it will return the 2nd element, because index starts from 0  
  //changing the element  
  al.set(1,"Dates");  
  //Traversing list  
  for(String fruit:al)    
    System.out.println(fruit);    
  
 }  
 
 
}  
//By Iterator interface.
//By for-each loop.
//By ListIterator interface.
//By for loop.
//By forEach() method.
//By forEachRemaining() method.
// 
