package week7;
import java.util.*;
public class RtTriangle extends Shape
{
	Scanner sc=new Scanner(System.in);
	private int width,height;
	public RtTriangle(int width,int height)
	{
		this.width=width;
		this.height=height;
	}
	public RtTriangle()
	{
		this.width=sc.nextInt();
		this.height=sc.nextInt();
	}
	void getArea()
	{
		double area=0.5*(this.height*this.width);
		System.out.println("Area of RtTriangle is "+area);
	}
	
	void getPerimeter()
	{
		System.out.println("perimeter of Rectangle is "+(this.height+this.width+Math.sqrt((height)*(height))+(width)*(width)));
	}
}
