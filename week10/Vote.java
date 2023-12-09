package week10;

public class Vote {
private int age;
  public Vote(int a)
   {
	this.age=a;
   }
 
public String Eligibitity() throws AgeEx
  {
	  if(this.age>18)
	  {
		  return "eligible for voting";
	  }
	  else 
	  {
		  throw new AgeEx(age);
	  }
  }
}
