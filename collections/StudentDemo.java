package collections;
import java.util.*;
public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
Student S1=new Student("Chandana","cse",10);
Student S2=new Student("Sai Sree","cse",9.99);
Student S3=new Student("Thribhuvana","cse",9.8);
ArrayList <Student> s1=new ArrayList<Student>();
s1.add(S1);
s1.add(S2);
s1.add(S3);
System.out.println(s1);

	}

}
