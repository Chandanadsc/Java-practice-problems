package week5;

public class Book {
/*
 * Create a class Book with BName, BId, BAuthor, and YOP (Year of Publication). Use proper getter and 
setter methods. BName must not have any special symbols except ‘-’, BId must not have any whitespace 
and special symbols, BAuthor must not have any special characters and digits, and YOP should contain only 
a 4-digit number. Use toString () to format the details of the book. 
 */
	
	private String BName;
	private int BId;
	private String Bauthor;
	private int YOP;
	public String getBName() {
		return BName;
	}
	public void setBName(String bName) {
		BName = bName;
	}
	public String getBauthor() {
		return Bauthor;
	}
	public void setBauthor(String bauthor) {
		Bauthor = bauthor;
	}
	public int getBId() {
		return BId;
	}
	public void setBId(int bId) {
		BId = bId;
	}
	public int getYOP() {
		return YOP;
	}
	public void setYOP(int yOP) {
		YOP = yOP;
	}
	public String toString()
	{
		
	}
}
