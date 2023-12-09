package kunalOOPs;
import java.util.*;
public class Thribhu {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);// scanning the string
	String s=sc.next();
	int n=s.length();//  size of the string is found 
	int a[]=new int[n];// solution index array is declared
	for(int j=0;j<n;j++)
	{
		a[j]=sc.nextInt();// the solution array is entered
	}
	char[] b=new char[n];// new char array to store the answer
	for(int i=0;i<n;i++)
	{
		
			b[i]=s.charAt(a[i]);
		
	}
	System.out.println(b);
	
	
}
}
