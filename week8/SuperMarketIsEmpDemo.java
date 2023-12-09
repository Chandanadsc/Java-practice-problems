package week8;
import java.util.*;
public class SuperMarketIsEmpDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		// TODO Auto-generated method stub
LinkedList<Employee> l1=new LinkedList<Employee>();
  int x;
  do {
	  System.out.println("Enter name");
	  String name=sc.next();

	  System.out.println("Enter id");
	   int id=sc.nextInt();

	  System.out.println("Enter cost");
	  double cost=sc.nextDouble();
	 l1.add(new Employee(name,id,cost));
	  System.out.println("Enter 1 to enter data");
	  x=sc.nextInt();
	  
  }
  while(x==1);
  l1.sort(Comparator.comparing(Employee->Employee.name));
  System.out.println(l1);
	}

}
