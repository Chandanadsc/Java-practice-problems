package co3;
import java.util.*;
public class Program1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap <String,String> h1=new HashMap<String,String>();
      Employee e1 =new Employee("214","Chandana");
      Employee e2 =new Employee("213","Thribhuvana");
      h1.put(e1.id, e1.name);
      h1.put(e2.id, e2.name);
      
      for (Map.Entry<String, String> set :
          h1.entrySet()) {

        
         System.out.println(set.getKey() + " = "
                            + set.getValue());
     }
	}

}
