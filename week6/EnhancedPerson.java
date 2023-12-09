package week6;

public class EnhancedPerson {
	private String name;
	private String address;
	private long phoneno;
	private String email;

public EnhancedPerson(String name,String address,long phoneno,String email){
	this.address=address;
	this.email=email;
	this.name=name;
	this.phoneno=phoneno;
}
public EnhancedPerson() {
	
}
public String toString()
{
	
		return "\nname "+this.name+"\nadd"+this.address+"\nemail "+this.email;
}

}
