package nnew;

public class StaticBlock {
static int a=2;
static int b;
static {
	StaticBlock.b=a*5;
}
public static void main(String args[])
{
	StaticBlock obj1=new  StaticBlock();
	System.out.println(StaticBlock.a+" "+StaticBlock.b);
	
	StaticBlock.b+=3;
	System.out.println(StaticBlock.a+" "+StaticBlock.b);
	StaticBlock obj2=new  StaticBlock();
	System.out.println(StaticBlock.a+" "+StaticBlock.b);
}// Nested classes --Incomplete
//class level - compile time
}
