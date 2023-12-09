package nnew;
import java.util.*;
public class AbstractDemo {

	public static void main(String[] args) {
		// a super class reference variable can refer to object of sub class
		//not possible to create object for abstract class but can create reference variable for abstract class
		Person p1;
		System.out.println("press 1 to create object \n press 2 for Faculty");
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		if(n==1)
		{
			p1=new Student("chandana",18,"cse",9.8);
		}
		else 
		{
			p1=new Faculty("Rama",35,"phd",85);
		}
		System.out.println("p1 is :"+p1);
		if(p1.isOutstanding())
		{
			System.out.println("outstanding");
		}
		else
		{
			System.out.println("Not outstanding");
		}
		
	}
//run time polymorphism is achieved during the run time of the program
//	which method to be called/invoked is based on the data type of the object type not based on reference type
//DYNAMIC METHOD DISPATCH(send) --(mechanism used for runtime polymorphism--java)
}
