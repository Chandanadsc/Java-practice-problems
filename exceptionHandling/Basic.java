package exceptionHandling;
//thse are the common Exception Scenarios we see
public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";  
		int a=50/0;//ArithmeticException  
		String s1=null;  
		System.out.println(s1.length());//NullPointerException  
		int i=Integer.parseInt(s1);//NumberFormatException 
		int[] b=new int[5];  
		b[10]=50; //ArrayIndexOutOfBoundsException  
	}

}
