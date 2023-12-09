package stringsInJava;

public class StringConcatinationinJAVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Sachin"+" Tendulkar";  
		   System.out.println(s);//Sachin Tendulkar  
		   //internally it is -> String s=(new StringBuilder()).append("Sachin").append(" Tendulkar).toString(); 
		String p=50+30+"Sachin"+40+40;  
		   System.out.println(p);//80Sachin4040 ->After a string literal, all the + will be treated as string concatenation operator. 
//		   String Concatenation by concat() method
//		   The String concat() method concatenates the specified string to the end of current string. Syntax:
//
//		   public String concat(String another)  
	}

}
