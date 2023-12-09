package kunal;
import java.util.*;
public  class CreateObjects {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Student s1=new Student();
		 int rollno;
		 String name;
		 float cgpa;
		 System.out.println(s1.rollno);
		 System.out.println(s1.name);
		 System.out.println(s1.cgpa);
		 Student random=new Student();
		System.out.println(random);
	}
	

	
	
	
}
class Student{
	int rollno;
	String name;
	float cgpa;
	


 Student()
	{
		this.rollno=13;
		this.name="chandana";
		this.cgpa=(float) 30.0;
	}

void greeting()
{
	System.out.println("hello my name is "+this.name);
}
void changeName()
{
	
	this.name="sailaja";
	
}
}

	
	
	
