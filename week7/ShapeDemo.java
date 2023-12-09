package week7;
import java.util.*;
public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n,a,b,c,d;
System.out.println("1:Rectangle\n2:rtTriangle");
n=sc.nextInt();
if(n==1)
{
	
		Rectangle r1=new Rectangle();
	r1.getArea();
	r1.getPerimeter();
}
else if(n==2)
{
	
	RtTriangle t1=new RtTriangle();
	t1.getArea();
	t1.getPerimeter();
}
	}

}
