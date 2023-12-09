package week6;

public class Faculty extends Employe{
// A faculty member has office hours and a rank.
	protected int hrs;
	protected int rank;
	
	public String toString()
	{
		return "name "+this.name+"\nadd"+this.address+"email "+this.email+" \n hrs="+this.hrs+"\nrank"+this.rank;
	}
	
}
