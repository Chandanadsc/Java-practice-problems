package stringsInJava;

public class ComparisonInStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Comparison in strings can be done in 3 ways
//1. equals() or equalsIgnorecase()
//2. == operator  -> to check the references
//3. compareTo(String another) method
		// using equals()
		String s1="Sachin";  
		   String s2="Sachin";  
		   String s3=new String("sachint");  
		   String s4="Saurav";  
		   System.out.println(s1.equals(s2));//true  
		   System.out.println(s1.equals(s3));//true  
		   System.out.println(s1.equals(s4));//false  
		 String s5="sachin";
		 // using equalsIgnorecase();
		 System.out.println(s1.equalsIgnoreCase(s5));// true -> s1 and s5 have same values in different cases
// By Using == operator -> checks the references of the objects
		 if(s1==s2)
		 {
			 System.out.println("True");
		 }
		 else {
			 System.out.println("False");
		 }
		 
//		 3) By Using compareTo() method
//		 The String class compareTo() method compares values lexicographically and returns an integer value that describes if first string is less than, equal to or greater than second string.
//
//		 Suppose s1 and s2 are two String objects. If:
//
//		 s1 == s2 : The method returns 0.
//		 s1 > s2 : The method returns a positive value.
//		 s1 < s2 : The method returns a negative value.
		 
		 System.out.println(s1.compareTo(s5));// -32 -> s1 is lexicographically lesser than s5
		 System.out.println(s1.compareTo(s2));//0  
		   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
		   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  
		 
	}

}
