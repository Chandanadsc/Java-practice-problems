package examlabandskilling;
import java.util.*;
public class Palindrome {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String s = scanner.nextLine();
	        if (isPalindrome(s)) {
	            System.out.println("Yes");
	        } else {
	            System.out.println("No");
	        }
	    }
	    
	    public static boolean isPalindrome(String s) {
	        
	        s = s.replaceAll("\\s", "").toLowerCase();
	        
	     
	        return s.equals(new StringBuilder(s).reverse().toString());
	    }
	}

