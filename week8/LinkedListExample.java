package week8;
import java.util.*;
public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		        // Creating object of the
		        // class linked list
		        LinkedList<String> ll = new LinkedList<String>();
		 //LinkedList<Integer> l1=new LinkedList<Integer>();
		        // Adding elements to the linked list
		        ll.add("A");
		        ll.add("B");
		        ll.addLast("C");
		        ll.addFirst("D");
		        ll.add(2, "E");
		 
		        System.out.println(ll);
		 
		        ll.remove("B");
		        ll.remove(3);
		        ll.removeFirst();
		        ll.removeLast();
		 
		        System.out.println(ll);
		    
	}

}
