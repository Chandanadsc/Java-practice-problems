package Patterns;
import java.util.*;
public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
printPascal(n);
	}
	public static void printPascal(int n)
	{
		for(int line =1;line <=n;line ++)
		{
			int c=1;
			for(int i=1;i<=line ;i++)
			{
				System.out.print(c+" ");
				c=c*(line-i)/i;
			}
			System.out.println();
		}
	}

}
//import java.io.*;
//class GFG {
//
//
//public static void printPascal(int n)
//{
//	for(int line = 1; line <= n; line++)
//	{
//		
//	int C=1;// used to represent C(line, i)
//	for(int i = 1; i <= line; i++)
//	{
//		// The first value in a line is always 1
//		System.out.print(C+" ");
//		C = C * (line - i) / i;
//	}
//	System.out.println();
//	}
//}
//
////Driver code
//public static void main (String[] args) {
//	int n = 5;
//	printPascal(n);
//}
//}
////This code is contributed
////by Archit Puri
//
