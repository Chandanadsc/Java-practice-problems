package week3;
import java.util.*;
public class GeometricShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n;

GeometricShape s1=new GeometricShape ();
long b=s1.FindArea(12,5);
System.out.println("Area of a Rectangle is"+b);
s1.FindArea(12, 5);
GeometricShape s2=new GeometricShape ();
long a =s2.FindArea(5);
System.out.println("Area of a Square is"+a);
s2.FindArea(5);

GeometricShape s3=new GeometricShape ();
double x=s3.FindArea(3.5);
System.out.println("Area of a circle is"+x);
s3.FindArea(3.5);

	}

}
