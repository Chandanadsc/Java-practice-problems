package stringmethods;

public class CharAt {
	public static void main(String[] args) {
		//used to obtain the char from the specified index
		String s1="Devi Sri Chandana";
		System.out.println(s1.charAt(0));
		// go to last char
		System.out.println(s1.charAt(s1.length()-1));
		// Equals
		//to check whether two strings are equal or not
		String s3="java";
		String s2="java";
		System.out.println("s2 and s3 are same"+s2.equals(s3));
		String s4="java";
		System.out.println("s2 and s4 are same"+s2.equalsIgnoreCase(s4));//IgnoreCase ignores the cases of the letters 
	
	}
	

	
	}

