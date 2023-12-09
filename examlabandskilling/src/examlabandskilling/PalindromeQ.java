package examlabandskilling;
import java.util.*;
public class PalindromeQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s1;
System.out.println("Enter a string");
s1=sc.next();
boolean x=isPalindrome(s1);
if(x)
{
	System.out.println("The string is a palindrome");
}
else 
{
	System.out.println("The given string is not a palindrome");
	
}


	}

	 
    public static boolean isPalindrome(String s) {
        
        s = s.replaceAll("\\s", "").toLowerCase();
        
     
        return s.equals(new StringBuilder(s).reverse().toString());
    }

}
