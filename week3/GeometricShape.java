package week3;

public class GeometricShape {
	public int FindArea(int x,int y)
	{
		//rectangle
		return x*y;
	}
	public int FindArea(int x)
	{
		//square
		return x*x;
	}
 public  double FindArea(double r)
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

