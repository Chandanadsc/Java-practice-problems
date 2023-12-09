package week5;

public class QuadraticEquation {

	
/*
 * Design a class named QuadraticEquation for a quadratic equation ax2 + bx + c = 0. The class contains: 
a) Private data fields a, b, and c that represent three coefficients. 
b) Three getter methods for a, b, and c. 
c) A method named getDiscriminant() that returns the discriminant, which is b2
- 4ac. 
d) The methods named getRoot1() and getRoot2() for returning two roots of the equation
 */
private  int  a;
private int b;
private int c;
public QuadraticEquation(int a, int b, int c) {
	this.a =  a;
	this.b = b;
	this.c = c;
	// TODO Auto-generated constructor stub
}
public QuadraticEquation() {
	// TODO Auto-generated constructor stub
}
public double getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
public double getB() {
	return b;
}
public void setB(int b) {
	this.b = b;
}
public double getC() {
	return c;
}
public void setC(int c) {
	this.c = c;
}
public double  getDiscriminant()
{
	double x=Math.sqrt((double)this.b*this.b-(4*this.a*this.c));
	System.out.println(x);
	return x;
}
public double getRoot1()
{
	double x=(this.getDiscriminant());
	double root1=Math.sqrt((double)(-this.b+x/(2.0*this.a)));
	return root1;
}
public double getRoot2()
{double x=(this.getDiscriminant());
	double root2=Math.sqrt((-this.b-x/(2.0*this.a)));
	return root2;
}
public String toString()
{
	return "a is "+this.a+"\nb is "+this.b+"\nc is "+this.c;
}
	
		
		
	

}
