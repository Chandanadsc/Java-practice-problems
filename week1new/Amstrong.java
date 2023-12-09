package week1new;

import java.util.Scanner;

public class Amstrong {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0,i,sum=0;
		for( i=n;i>0;i=i/10)
		{
			c++;
			
		}
		for(i=n;i>0;i=i/10)
		{
			sum=(int) (sum+Math.pow(i%10,c));
			
		}
		if(sum==n)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
	}
}
