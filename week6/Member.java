package week6;

public class Member {
/*
 * Create a class named 'Member' having the following members:
Data members
• Name
• Age
• Phone number
• Address
• Salary
It also has a method named 'printSalary' which prints the salary of the members. Two classes 
'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' classes have 'specialization' as 
data members and 'Manager' has 'department' as data members. Now, assign name, age, phone
number, address and salary to an employee and a manager by making an object of both classes and 
print the same
 */
	private String name;
	private int age;
	private long phno;
	private String add;
	private double salary;
	public Member(String name,int age,long phno,String add,double salary)
	{
		this.add=add;
		this.age=age;
		this.name=name;
		this.phno=phno;
		this.salary=salary;
	}
	public Member()
	{
		
	}
	public String toString()
	{
		return "name:"+this.name+"\nage:"+this.age+"\naddress"+this.add+"\nphno"+this.phno+"\nsalary"+this.salary;
	}
}

