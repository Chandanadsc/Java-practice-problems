package nnew;
import java.util.*;
public class DriversDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Driverlisence d1=new Driverlisence();
Scanner sc=new Scanner(System.in);
System.out.println("enter age and marks ");
  System.out.println("marks =0 if test not attended\n");
  int age;
  
  age=sc.nextInt();
  try
  {
	  d1.LicenseAge(age);
  }
  catch(UnderAgeEx x)
  {
	  System.out.println(x);
  }
  catch(MarksEx m)
  {
	  System.out.println(m);
  }
	}

}
