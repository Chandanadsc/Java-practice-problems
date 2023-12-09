package week6;

public class Employee extends Member{
private String specialization;
public Employee(String name,int age,long phno,String add,double salary,String spe)
{
	super(name,age,phno,add,salary);
	this.specialization=spe;
	
}
public Employee()
{
	
}
public String toString()
{
	return super.toString()+"\nspecialization"+this.specialization;
}

}
