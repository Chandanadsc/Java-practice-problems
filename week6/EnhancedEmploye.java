package week6;

public class EnhancedEmploye extends EnhancedPerson{
	private String office;
	private double salary;
	private String date;
	public EnhancedEmploye(String name,String address,long phoneno,String email,String office,double salary,String date)
	{
		super(name,address,phoneno,email);
		this.office=office;
		this.salary=salary;
		this.date=date;
	}
	public EnhancedEmploye()
	{
		
	}
	
		
	public String toString()
	{
		return super.toString()+" \n office="+this.office+" \n salary="+this.salary+" \n date="+this.date;
	}
	
}

