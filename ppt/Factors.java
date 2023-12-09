package ppt;
import java.util.*;
public class Factors {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
int n,i;
System.out.println("Enter a number");
n=sc.nextInt();
for(i=1;i<=n/2;i++)
{
	if(n%i==0)
	{
		System.out.println(i);
	}
}
	}
}
