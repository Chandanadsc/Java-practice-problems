package ppt;
import java.util.*;
public class Main_class {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a;
		int b;
		System.out.println("Enter a and b in int");
		
		A_class x=new A_class();
		x.add()
		;
		x.div();
		int l ;
		float m;
		System.out.println("Enter l in int and m in float");
		l=sc.nextInt();
		m=sc.nextFloat();
		B_class y= new B_class(l,m);
		
		y.add(l, m);
		y.mul(l, m);
		
	}

}
