package week10;
import java.util.*;

public class VoteDemo {

	public static void main(String[] args) throws AgeEx {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age;
		System.out.println("Enter age ");
		age=sc.nextInt();
		Vote v1=new Vote(age);
try {
	
	v1.Eligibitity();	
}
catch(AgeEx b)
{
	System.out.println("Voter not Eligible for Voting");
}

finally
{
	System.out.println("Bye bye");
}
	
	}

}
