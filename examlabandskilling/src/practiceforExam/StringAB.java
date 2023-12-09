package practiceforExam;
import java.io.*;
public class StringAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer A=new StringBuffer("hellokitty");
StringBuffer B=new StringBuffer("byekitty");
System.out.println("Sum of length is "+A.length()+B.length());
int a=(A.compareTo(B));
if(a>0)
{
	System.out.println("A is greater");
}
else if(a<0)
{
	System.out.println("B is greater");
}
else 
{
	System.out.println("Equal");
}
String sc=A.substring(0,1).toUpperCase()+A.substring(1,A.length());
String st=B.substring(0,1).toUpperCase()+B.substring(1,B.length());
System.out.print(sc+" "+st);
	}

}
