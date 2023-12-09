package ppt;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter a number ");
n=sc.nextInt();
long fact=1;
  for(int i=n;i>0;i--)
  {
	  fact=fact*i;
  }
  System.out.println("fact of given num is"+fact);
	}

}
