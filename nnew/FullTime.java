package nnew;

public class FullTime extends Employe {
private	double basic ;
private float hdr;
private float da;
	public FullTime(long id,String name,double basic,float hdr,float da)
	{
		super(id,name);
		this.basic=basic;
		this.hdr=hdr;
		this.da=da;
	}
	public String toString()
	{
		return super.toString()+"\nbasic :"+this.basic+"\nhdr is :"+this.hdr+"\nda is :"+this.da+"total Salary is "+this.Salary();
	}
	public double Salary()
	{
		return this.basic+this.da+this.hdr;	
	}
}
