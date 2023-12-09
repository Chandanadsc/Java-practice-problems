package week5;

public class QuadraticEquationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuadraticEquation q1=new QuadraticEquation();
		q1.setA(2);
		q1.setB(3);
		q1.setC(1);
		System.out.println(q1.toString());
		double c=q1.getDiscriminant();
		double d=q1.getRoot1();
		double e=q1.getRoot2();
		System.out.println("Discriminant is"+c);
		System.out.println("the roots are r1 and r1="+d+"And"+e);
		
	}

}// you idiot you didn't get the output properly -bummer......
