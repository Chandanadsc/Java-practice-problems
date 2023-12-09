package co1;
import java.util.*;
import java.util.TreeSet;

public class  TreeSets{
	public static void main(String[] args) {
		TreeSet<Student> st = new TreeSet<Student> ();	
		Student s1=new Student("214","Chandana",95);
		st.add(s1);

		Student s2=new Student("213","Thribhu",95);
		st.add(s2);
		
		Student s3=new Student("45","SaiSree",95);
	
		st.add(s3);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
	
	}
}

