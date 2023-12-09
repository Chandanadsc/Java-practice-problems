package week7;
import java.util.*;
public class MarksDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
 
 int n;
 System.out.println("1:Student A\n2:Student B");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 
 if(n==1)
 {
	 A a1=new A();
	 a1.getPercentage();
 }
 else if(n==2)
 {
	 B b1=new B();
	 b1.getPercentage();
 }
	}

}
