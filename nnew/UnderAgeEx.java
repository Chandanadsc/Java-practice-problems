package nnew;

public class UnderAgeEx extends Exception {
private int age;
   public UnderAgeEx(int a)
{
	this.age=a;
  }
   public String toString()
   {
	
	return "Under age \n Try again after "+(18-this.age)+"year/years";
  }
}
