package nnew;

abstract public class Person {
	private String name;
	private int age;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String toString()
	{
		return "Name is "+this.name+"age is "+this.age;
	}
	public abstract boolean isOutstanding();
	
}
