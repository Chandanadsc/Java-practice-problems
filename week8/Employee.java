package week8;

public class Employee {
/*
 * The Owner of a Supermarket asks the Employee to maintain a detailed record consisting Name, Id and Cost 
of the item available in their supermarket. He also asks him to get the information of those items in 
ascending order of the costs. He asks your help for writing a program which takes in the details through the 
Scanner class and add them to the array list. Your program should also display the details of the items 
compared in ascending order of the item cost. (Use LinkedList )*/
	public String name;
	public int id;
	public double cost;
	public Employee(String name,int id,double cost)
	{
		this.cost=cost;
		this.name=name;
		this.id=id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return this.name;
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public int getid()
	{
		return this.id;
	}
	public void setcost(double cost)
	{
		this.cost=cost;
	}
	public double getcost()
	{
		return this.cost;
	}
	public String toString()
	{
		return this.name+this.id+this.cost;
	}
}
