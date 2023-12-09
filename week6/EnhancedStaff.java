package week6;

public class EnhancedStaff extends EnhancedPerson{
private String title;

public EnhancedStaff(String name,String address,long phoneno,String email,String title)
{
	super(name,address,phoneno,email);
	this.title=title;
	
	
}
	public String toString()
	{
		return " \n title="+this.title;
	}
}
