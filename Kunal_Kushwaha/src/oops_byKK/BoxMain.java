package oops_byKK;

public class BoxMain {

	public static void main(String[] args) {
		Box b1=new Box(12,3,5);
		Box b2=new Box(b1);
		Box x= new BoxWeight(1,2,4,6);
	System.out.println(b1.l+" "+b1.h+" "+b1.w);	
System.out.println(x);
	System.out.println(b2.l+" "+b2.h+" "+b2.w);	
	
	}

}
// what type of the reference variable will determine what members can be accessed not what obj is being created
//Box x= new BoxWeight(1,2,4,6);
