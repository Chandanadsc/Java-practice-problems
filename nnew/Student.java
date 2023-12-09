package nnew;

public class Student extends Person {
String course ;
double cgpa;
public Student(String name,int age,String course,double cgpa)
{
	super(name,age);
	this.course=course;
	this.cgpa=cgpa;
}
public String toString()
{
	return "Name is "+this.course+"age is "+this.cgpa;
}
public boolean isOutstanding()
{
	 return (this.cgpa>9.0);
}
}
