package kunal;
import java.util.*;
public class LeapYear {
//Input a year and find whether it is a leap year or not.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   int year;
   System.out.println("Enter year");
   year=sc.nextInt();
   
   if(year%4==0)
   {
	   if(year%100==0)
	   {
		   System.out.println("YES");
	   }
	   else
	   {
		   System.out.println("NO");
	   }
	   
   }
   else 
      {
	   System.out.println("NO");
      }
	}

}
