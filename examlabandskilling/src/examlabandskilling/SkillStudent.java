package examlabandskilling;
import java.util.*;
public class SkillStudent {
long id;
String name;
String course;
double fee;
public void acceptData()
{
	Scanner sc=new Scanner(System.in);
	this.id=sc.nextLong();
	this.name=sc.next();
	this.course=sc.next();
	this.fee=sc.nextDouble();
}
public void display()
{
	System.out.println("id is "+this.id);
	System.out.println("name is "+this.name);
	System.out.println("course is "+this.course);
	System.out.println("fee is "+this.fee);
}
}
