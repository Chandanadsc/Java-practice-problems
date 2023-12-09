package practiceforExam;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string");
String string=sc.next();
String nstr = null;
for(int i=0;i<string.length();i++)
{
	char ch=string.charAt(i);
	nstr=nstr+ch;
}
    if(nstr.equals(string));
{
	System.out.println("Palindrome");
}
{
	System.out.println("Is not a palindrome");
}
	}

}
