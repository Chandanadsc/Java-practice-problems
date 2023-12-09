package nnew;
import java.util.*;
public class Driverlisence  {
	int marks;
  public void   LicenseAge(int age) throws UnderAgeEx,MarksEx
  {
	  Scanner sc=new Scanner(System.in);
	  if(age>18)
	  {
		  System.out.println("You are now eligible for the test");
		  System.out.println("enter the marks of your test");
		  marks=sc.nextInt();
		 
		  if(marks>70)
		  {
			  System.out.println("Passed ");
		  }
		  else 
		  {
			 throw new MarksEx();
		  }
	  }
	  else 
	  {
		  throw new UnderAgeEx(age);
	  }
  }

}
