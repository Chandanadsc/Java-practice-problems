package ppt;

public class B_class {
	private int a;
	private float b;
	B_class(int x,float  y)
	{
		this.a=x;
		this.b=y;
	}
	void add(int a,float b)
	{
		System.out.println("Sum is "+(a+b));
	}
	void mul(int a,float b)
	{
		System.out.println("Mul is"+(a*b));
	}

}
