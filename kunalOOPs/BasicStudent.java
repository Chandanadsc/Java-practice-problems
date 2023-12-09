package kunalOOPs;

public class BasicStudent {
String name;
String branch;
double cgpa;
public BasicStudent(String name,String branch,double cgpa)
{
	this.name=name;
	this.branch=branch;
	this.cgpa=cgpa;
	
}
public BasicStudent()
{// this is how you call a constructor from another constructor
	this("charvi","ECE",9.8);
}
}
