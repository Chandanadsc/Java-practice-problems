package collections;

public class Student {
String name;
String course;
double cgpa;
public Student(String name,String course,double cgpa)
{
	this.name=name;
	this.course=course;
	this.cgpa=cgpa;
}
public String toString()
{
	return "name "+this.name+"course "+this.course+"cgpa "+this.cgpa;
}
}
