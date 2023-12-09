package practiceforExam;
import java.util.*;
public class MyCalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the values of and p");
int n=sc.nextInt();
int p=sc.nextInt();
try
{
	MyCalculator c1=new MyCalculator();
	System.out.println(c1.power(n, p));
}
catch(ZeroEx e1)
{
	System.out.println(e1.toString());
}
catch(NegitiveEx e2)
{
	System.out.println(e2.toString());
}

	}

}
