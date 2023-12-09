package kunal;
import java.util.*;
public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter p,r,t");
		int p=sc.nextInt();
		double r=sc.nextDouble();
		int t= sc.nextInt();
		double simple=(p*r*t);
		System.out.println("simple interest = "+(double)simple);
	}

}
