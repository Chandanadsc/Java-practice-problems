package nnew;

public class PartTime extends Employe {
private	int sal ;
private int hr;

	public PartTime(long id,String name,int sal,int hr)
	{
		super(id,name);
		this.sal=sal;
		this.hr=hr;
	}
	public String toString()
	{
		return super.toString()+"\nsal is :"+this.sal+"\nNumber of worked in a month is :"+this.hr+"total Salary is "+this.Salary();
	}
	public double Salary()
	{
		return this.sal*this.hr;	
	}
}
