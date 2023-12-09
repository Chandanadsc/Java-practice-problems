package week4;

public class Student {
/* Create a Class Student with instance variables id, name, marks of 3 subjects and two
 *  instance methods 
findTotal () and findAverage (). Create 2 objects in main () and access the methods using 
these objects. 
Display the details along with total and percentage obtained. (Use hard coded input)*/
	long id;
	String name;
	int m1, m2, m3;
	
	public Student(long id,String name,int m1,int m2 ,int m3)
	{
		this.id=id;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	void findTotal()
	{
		System.out.println("total is"+(this.m1+this.m2+this.m3));
	}
	void findAverage()
	{
		System.out.println("average is "+(double)(this.m1+this.m2+this.m3)/3.0);
	}
	public String toString()
	{
		return "ID :"+this.id+"\nname :"+this.name;
	
	}
}
