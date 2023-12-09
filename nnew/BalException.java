package nnew;

public class BalException extends Exception{
	private double remainingBal;
public	BalException(double b)
{
	this.remainingBal=b;
}
public String toString()
   {
	
	return "Insufficient Balance\n Try again \n availabe bal is "+this.remainingBal;
  }
}
