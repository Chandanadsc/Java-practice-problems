package week7;
import java.util.*;
public class Rectangle extends Shape {
private int width,height;
Scanner sc=new Scanner(System.in);
public Rectangle(int width,int height)
{
	this.width=width;
	this.height=height;
}
public Rectangle()
{
	this.width=sc.nextInt();
	this.height=sc.nextInt();
}
void getArea()
{
	System.out.println("Area of Rectangle is "+this.height*this.width);
}
void getPerimeter()
{
	System.out.println("perimeter of Rectangle is "+2*(this.height+this.width));
}


}
