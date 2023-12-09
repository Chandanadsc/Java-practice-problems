package practiceforExam;
import java.util.*;
public class StudentVectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<StudentVector> v1=new Vector<StudentVector>();
Scanner sc=new Scanner(System.in);
String name;
String id;
int x=0;
do {
	name=sc.next();
	id=sc.next();
	v1.add(new StudentVector(name,id));
	System.out.println("Enter 1 to continue");
	x=sc.nextInt();
	
}

while(x==1);
System.out.println(v1);
System.out.println("Enter the Id to search");
String sid=sc.next();
//next Searching is still left

for(StudentVector i: v1)
{
	if(i.name.equals(sid))
	{
		System.out.println("student found");
		break;
	}
}
	}

}
