package ppt;

import java.util.Scanner;

class Main{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Student s1=new Student();
		s1.id=sc.nextInt();
		s1.name=sc.next();
		s1.Print();
	}
}