package week6;

public class Student extends Person{
// class status (freshman,sophomore, junior, or senior)
	protected String status;
	public String toString()
	{
		return "name "+this.name+"\nadd"+this.address+"email "+this.email+" \n status="+this.status;
	}
	
}
