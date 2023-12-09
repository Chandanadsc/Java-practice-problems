package week5;

public class MyTriangleDemo {
public static void main(String[]args)
{
	MyTriangle t1=new MyTriangle();
	t1.setSide1(2);
	t1.setSide2(1);
	t1.setSide3(3);
	t1.getSide1();
	t1.getSide2();
	t1.getSide3();
	t1.Area();
	boolean x=t1.isValid();
	System.out.println(x);
			
	
}
}
