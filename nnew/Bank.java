package nnew;

public class Bank {
private int accno;
private String accname;
private double bal;
public Bank(int no,String name,double bal)
{
	this.accno=no;
	this.accname=name;
	this.bal=bal;
}
public double WithDraw(int am) throws BalException//amount
{
	if(am<=this.bal)
	{
		this.bal=this.bal-am;
	return this.bal;
	}
	else
	{
		throw new BalException(this.bal);
	}
}
}
