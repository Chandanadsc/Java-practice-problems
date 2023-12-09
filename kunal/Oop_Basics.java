package kunal;
class Class
{
	String name;
	int age;
	
	public void printInfo()
	{
		System.out.println(this.name);
		System.out.println(this.age);
	}
	Class()
	{
	System.out.println("constructor called");	
	}
	Class(String name,int age)
	{
		this.name=name;
		this.age=age;
		
	}
	Class(Class s4){
		this.name=s4.name;
		this.age=s4.age;//copy constructor
	}
}

public class Oop_Basics {
public static void main(String[] args)
{
	
	Class s1=new Class();
	System.out.println("enter your name and age");
	s1.name="chandana";
	s1.age=14;
	s1.printInfo();
	Class s2=new Class();
	s2.name="sai sree";
	s2.age=17;
	s2.printInfo();
	Class s3=new Class("chandana",17);
	Class s4=new Class(s1);//copy constructor
	s4.printInfo();
}
}

