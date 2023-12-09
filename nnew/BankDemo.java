package nnew;
import java.util.*;
public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
Bank b1=new Bank(101,"chan",5000);
System.out.println("enter amount to withdraw");
double am=sc.nextDouble();

try {
	double Bal=b1.WithDraw((int)am);
b1.WithDraw((int) am);
System.out.println("withdrawn Successfully\nAvailable Bal is"+Bal);
	}
catch(BalException b)
{
	System.out.println("withdraw failure due "+b1);
}
finally {
	System.out.println("Kindly collect your card");
}

}
}//invalid note 
