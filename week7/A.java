package week7;
import java.util.*;
public class A extends Marks{
private int m1,m2,m3;
Scanner sc=new Scanner(System.in);
public A(int m1,int m2,int m3)
{
	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
}
public A()
{
	this.m1=sc.nextInt();
	this.m2=sc.nextInt();
	this.m3=sc.nextInt();
}
	@Override
	void getPercentage() {
		double per=(this.m1+this.m2+this.m3)/3;
		System.out.println("Percentage obtained is "+(per));
		// TODO Auto-generated method stub
		
	}

}
