package week6;

public class Manager extends Member{
	private String department;
	public Manager(String name,int age,long phno,String add,double salary,String dpt)
	{
		super(name,age,phno,add,salary);
		this.department=dpt;
		
	}
	public Manager()
	{
		
	}
	public String toString()
	{
		return super.toString()+"\ndepartment"+this.department;
	}
}
