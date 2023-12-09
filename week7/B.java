package week7;
import java.util.*;
public class B extends Marks{
private int m1,m2,m3,m4;
Scanner sc=new Scanner(System.in);
public B(int m1,int m2,int m3)
{
	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
	this.m4=m4;
}
public B()
{
	this.m1=sc.nextInt();
	this.m2=sc.nextInt();
	this.m3=sc.nextInt();
	this.m4=sc.nextInt();
}
	@Override
	void getPercentage() {
		double per=(this.m1+this.m2+this.m3+this.m4)/4;
		System.out.println("Percentage obtained is "+(per));
		// TODO Auto-generated method stub
		
	}

}
