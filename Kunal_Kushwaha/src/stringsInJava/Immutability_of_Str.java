package stringsInJava;

public class Immutability_of_Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
			   String s="Sachin";  
			   s.concat(" Tendulkar");//concat() method appends the string at the end  
			   System.out.println(s);//will print Sachin because strings are immutable objects  
			
// a new String SachinTendulkar is created but s is not pointing to it yet
			   // if
			 s=  s.concat(" Tendulkar");
			 System.out.println(s);
	}

}
