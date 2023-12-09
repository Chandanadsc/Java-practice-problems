package practiceforExam;

public class RtTriangle extends Shape{
//Write a concrete subclass 
	 //* RtTriangle with the following. • Data members: width, height*/
	int width;
	int height;
	
	public RtTriangle(int n)
	{
		super(n);
		
	}
	public void getArea()
	{
		System.out.println("Area is "+0.5*this.width*this.height);
	}
	public void getPerimeter()
	{
		System.out.println("Perimeter is "+(double)this.width+this.height+Math.sqrt(height*height+width*width));
	}
}
