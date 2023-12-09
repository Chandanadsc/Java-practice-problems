package functionsAndEtc;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Factorial is");
		Factorial( a);
	}
	static void Factorial(int a)
	{ 
		int fact=1;
		for(int i=a;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
