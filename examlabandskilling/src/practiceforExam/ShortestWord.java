
package practiceforExam;
import java.util.*;
public class ShortestWord {
	
	
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			// TODO Auto-generated method stub
	Vector<String> l1=new Vector<String>();
	  int x,y,min = 0;
	  System.out.println("Enter name");
	  String name=sc.next();
	  y=name.length();
	  do {
		 
		  System.out.println("Enter name");
		   name=sc.next();
		  
	y=name.length();

	if(y<min)
	{
		min=y;
	}
		 l1.add(name);
		  System.out.println("Enter 1 to enter data");
		  x=sc.nextInt();
		  
	  }
	  while(x==1);

	  System.out.println(min);
	
	}

}