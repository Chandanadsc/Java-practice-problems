package functionsAndEtc;

import java.util.*;
public class Employe {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the type of Employe");
	System.out.println("Enter 1 for Full Time Employe\n2 for Part-Time ");
	int x=sc.nextInt();
	if(x==1)
	{
		int perhr,hrs;
		System.out.println("Enter number of hours");
		perhr=sc.nextInt();
		System.out.println("Enter salary per hr");
		hrs=sc.nextInt();
		partTime p1=new partTime(perhr,hrs);
		p1.Calculate();
	}
	if(x==2)
	{
		double basic;
		System.out.println("Enter basic salary");
		basic=sc.nextDouble();
		FullTime p2=new FullTime(basic);
		p2.calculate();
	}
}
}
