package week3;

import java.util.Scanner;

public class GeometricAllinOne {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n;


long b=FindArea(12,5);
System.out.println("Area of a Rectangle is"+b);
FindArea(12, 5);

long a =FindArea(5);
System.out.println("Area of a Square is"+a);
FindArea(5);


double x=FindArea(3.5);
System.out.println("Area of a circle is"+x);
FindArea(3.5);

	}
	public static int FindArea(int x,int y)
	{
		//rectangle
		return x*y;
	}
	public static int FindArea(int x)
	{
		//square
		return x*x;
	}
 public static  double FindArea(double r)
 {
	 return 3.14*r*r;
 }
 public  void FindPerimeter(int x,int y)
 {
	 System.out.println("Perimeter of rectangle is"+2*(x+y));
 }
 public  void FindPerimeter(int x)
 {
	 System.out.println("Perimeter of square is"+4*(x));
 }
 public  void FindPerimeter(double x)
 {
	 System.out.println("Perimeter of square is"+(2*3.14*x));
 }
 
}
