package week6;

public class EnchancedFaculty extends EnhancedPerson{
	private int hrs;
	private int rank;
	
	public EnchancedFaculty(String name,String address,long phoneno,String email,int hrs,int rank)
	{
		super(name,address,phoneno,email);
		this.hrs=hrs;
		this.rank=rank;
		
	}
	public String toString()
	{
		return super.toString()+" \n hrs="+this.hrs+"\nrank"+this.rank;
	}
	
}
