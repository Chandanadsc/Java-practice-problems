package kunal;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter p,q");
		int p=sc.nextInt();
		int q=sc.nextInt();
		double x=0;
		System.out.println("Enter the operator ");
		String operator=sc.next() ;
		if(operator.equals("+"))
		{
			x=p+q;
		}
		else if(operator.equals("-"))
		{
			x=p-q;
		}
		else if(operator.equals("*"))
		{
			x=p*q;
		}
		else if(operator.equals("/"))
		{
			x=p/q;
		}
		System.out.println("Ans "+x);
	}
	

}
