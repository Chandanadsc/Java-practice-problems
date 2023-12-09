package co3;

public class Employee {
String id;
String name;

public Employee(String id,String name)
{
	this.id=id;
	this.name=name;
}
public String toString()
{
	return("Id : "+this.id+"Name : "+this.name);
}


}
