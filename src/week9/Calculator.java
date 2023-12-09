package week9;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Calculator//Codechef
{

	public static void main(String[] args) throws java.lang.Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
			
			int a=sc.nextInt();
			int b=sc.nextInt();
			String x=sc.next();
			if(x.charAt(0)=='+')
			{
				System.out.println(a+b);
			}
			else if(x.charAt(0)=='-')
			{
				
				System.out.println(a-b);
			}
			else if(x.charAt(0)=='*')
			{
			
				System.out.println(a*b);
			}
			else if(x.charAt(0)=='/')
			{
				double res;
				res=a/b;
				System.out.println(res);
			}
			
			
		}
	}





