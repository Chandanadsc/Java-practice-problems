package ppt;
import java.util.*;
public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
int ch;
System.out.println("1:Circle2\n:Square3\n:Rectangle\n4:Rhombus\n5:Triangle");
ch=sc.nextInt();
double area=0;
double perimeter=0;
if(ch==1)
{
	System.out.println("Enter radius");
	int radius=sc.nextInt();
	
		perimeter=2*3.14*radius;
	area=3.14*radius *radius;
}
if(ch==2)
{
	System.out.println("Enter side");
	int side=sc.nextInt();
	
		perimeter=4*side;
	area= side*side;
}
if(ch==3)
{
	System.out.println("Enter l and b");
	int l=sc.nextInt();
	int b=sc.nextInt();
		perimeter=2*l+2*b;
	area=l*b;
}
if(ch==4)
{
	System.out.println("Enter side");
	int side=sc.nextInt();
	
		perimeter=4*side;
	area=side*side;//later
}
if(ch==5)
{
	System.out.println("Enter side1 ,side 2,side 3");
	int s1=sc.nextInt();
	int s2=sc.nextInt();
	int s3=sc.nextInt();
		perimeter=s1+s2+s3;
		double s=perimeter/2.0;
	area=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
}
System.out.println("Area is"+(double)area+"\nperimeter is "+(double )+perimeter);



	}

}
