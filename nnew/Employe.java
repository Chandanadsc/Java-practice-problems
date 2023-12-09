package nnew;

public abstract class  Employe {
private long empid;
private String ename;
 
public Employe(long id,String name)
{
	this.empid=id;
	this.ename=name;
}
public String toString()
{
	return "employe id is:"+this.empid+"\nname is:"+this.ename;
}
public  abstract double  Salary();

}
