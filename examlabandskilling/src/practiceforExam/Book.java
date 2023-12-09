package practiceforExam;

public class Book {
private	String BName;
private String BId;
private String BAuthor;
private	int YOP;
public Book() {
	// TODO Auto-generated constructor stub
}

 public Book(String BName,String BId,String BAuthor,int YOP)
 {
	 this.BAuthor=BAuthor;
	 this.BId=BId;
	 this.BName=BName;
	 this.YOP=YOP;
 }
 /*
  * 2)	Create a class Book with BName, BId, BAuthor, and YOP (Year of Publication). Use proper getter and 
  * setter methods. BName must not have any special symbols except ‘-’, BId must not have any whitespace and
  *  special symbols, BAuthor must not have any special characters and digits, and YOP should contain only a
  *   4-digit number. Use toString () to format the details of the book. And enhance the setter methods to 
  *   throw an exception is the data passed to setter is not a valid data. Create 2 objects in main () and 
  *   access the methods using these objects. Display the details*/
 	
 
public String toString()
 {
	 return "BName: "+this.BName+"\nBId"+this.BId+"BAuthor"+this.BAuthor+"YOP"+this.YOP;
 }

public String getBName()  {
	return BName;
}
public void setBName(String bName) throws Exception{//BName must not have any special symbols except ‘-’
	if(bName.contains("-")&&bName.matches("[a-zA-z]"))
	{
		this.BName=bName;
	}
	else
	{
		throw new Exception();
	}
		
}

public String getBId() {
	return BId;
}
public void setBId(String bId) throws Exception {//BId must not have any whitespace and  special symbols
	  if (!bId.matches("^[a-zA-Z0-9]+$")) {
          throw new Exception("Invalid book ID");
      }
	  this.BId = bId;
}
public String getBAuthor() {
	return BAuthor;
}
public void setBAuthor(String bAuthor)throws Exception {
	 if (!bAuthor.matches("^[a-zA-Z\\s]+$")) {
         throw new Exception("Invalid book author");
     }
	this.BAuthor = bAuthor;
}
public int getYOP() {
	return YOP;
}
public void setYOP(int yop) throws Exception {
	 if (yop < 1000 || yop > 9999) {
         throw new Exception("Invalid year of publication");
     }
	this.YOP=yop;
}
}

	
