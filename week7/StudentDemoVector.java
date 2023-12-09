package week7;
import java.util.Vector;
import java.util.*;
public class StudentDemoVector {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
	Vector<StudentVector> v1=new Vector<StudentVector>();
	int x;
	do
	{
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter rollno");
		
		int rollno=sc.nextInt();
		v1.add(new StudentVector(name,rollno));
		System.out.println("Enter 1 to add");
		x=sc.nextInt();
	}while(x==1);
	System.out.println(v1);
		}

}
