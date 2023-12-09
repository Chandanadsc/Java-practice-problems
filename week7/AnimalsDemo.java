package week7;
import java.util.*;
public class AnimalsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter 1 for cats and 2 for dogs");
int n;
n=sc.nextInt();
if(n==1)
{
	Cats c1=new Cats();
	c1.speak();
}
else if(n==2)
{
	Dogs d1=new Dogs();
	d1.speak();
}
	}

}
