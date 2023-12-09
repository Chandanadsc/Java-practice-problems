package functionsAndEtc;
import java.util.*;
public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int max=Max(a,b,c);
int min=Min(a,b,c);
int sum=Sum(a,b);
int pro=product(a,b);
System.out.println("max is"+max);
System.out.println("min is"+min);
System.out.println("sum is"+sum);
IsEven(a);
System.out.println("Product is"+pro);

	}
	static int Max(int a,int b , int c)
	{
		int max=a;
		if(max<=b)
		{
			max=b;
		}
		if(max <=c)
		{
			max=c;
		}
		return max;
	}
	static int Min(int a,int b , int c)
	{
		int min=a;
		if(min>=b)
		{
			min=b;
		}
		if(min >=c)
		{
			min=c;
		}
		return min;
	}
	static int Sum(int a,int b)
	{
		return a+b;
	}
	static void IsEven(int a)
	{
		if(a%2==0)
		{
			System.out.println(a+" is Even");
		}
		else
		{
			System.out.println(a+" is Odd");
		}
	}
	static int product(int a,int b)
	{
		return a*b;
	}
	

}
