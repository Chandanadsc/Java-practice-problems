package week1new;
import java.util.*;
public class fibinocci {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int x1=0,x2=1,x3;
	
	for(int i=0;i<n-2;i++)
	{
		if(i==0)
		{
		System.out.println(x1+"\n"+x2);
		}
		x3=x1+x2;
		x1=x2;
		x2=x3;
		System.out.println(x3);
	}
}
}
