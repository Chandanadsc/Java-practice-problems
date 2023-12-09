package week9;
import java.util.*;
public class studentTest {

	public static void main(String[] args) {
		int test1,test2,alm,ha;
		ArrayList<Integer> a1= new ArrayList<Integer>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n=sc.nextInt();
		int array[]= new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter student roll no");
			int rollno=sc.nextInt();
			System.out.println("Enter the details of student "+i+1);
			
			System.out.println("Enter the marks scored in test1");
					
					test1=sc.nextInt();
			System.out.println("Enter the marks scored in test2");
					
					test2=sc.nextInt();
			System.out.println("Enter the marks scored in alm");
					
					alm=sc.nextInt();
			System.out.println("Enter the marks scored in HA");
					
			ha=sc.nextInt();
			
		  double total = (float) ((test1/50.0)*7.5+(test2/50.0)*7.5+(alm/100)*10+(ha/100)*10);
			if(total<30)
			{
				System.out.println("The total score obtained by the student"+i+1+" is "+total);
				a1.add(rollno);
			}
			
			
		}
		System.out.println("The list of students eligible for Remidial ");
		System.out.println(a1);
		
		
		
		

	}

}
