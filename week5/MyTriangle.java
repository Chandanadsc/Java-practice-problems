package week5;

public class MyTriangle {
/*
 * Create a class named MyTriangle that contains three instance variables-side1 (type int), side2(type int), 
side3(type int). Write getter and setter methods for instance variables. Create two methods named isValid () 
and area (). First one checks the input is valid or not. If the input is not valid display as invalid. Second 
method computes area if the input is valid.
 */
	private int side1;
	private int side2;
	private int side3;
	public int getSide1() {
		return side1;
	}
	public void setSide1(int side1) {
		this.side1 = side1;
	}
	public int getSide2() {
		return side2;
	}
	public void setSide2(int side2) {
		this.side2 = side2;
	}
	public int getSide3() {
		return side3;
	}
	public void setSide3(int side3) {
		this.side3 = side3;
	}
	public boolean isValid()
	{
		if((this.side3<this.side1+this.side2)&&(this.side2>this.side1+this.side3)&&(this.side1<this.side3+this.side2))
		{
			return true;
		}
		return false;
		
	}
	public void Area()
	{
		double s=(this.side1+this.side2+this.side3)/2;
		double x=(s*(s-this.side1)*(s-this.side2)*(s-this.side3));
		System.out.println("Area of the triangle is "+x);
	}
}

	

