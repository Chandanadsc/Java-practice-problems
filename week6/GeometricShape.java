package week6;

public class GeometricShape {
//Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle
	protected int side1;
	protected int side2;
	protected int side3;
	protected String colour;
	public int getArea()
	{
		return this.side1+this.side2*this.side3;// not interested in writing the whole formula
	}
	public int getPerimeter()
	{
		return this.side1+this.side2+this.side3;
	}
}
