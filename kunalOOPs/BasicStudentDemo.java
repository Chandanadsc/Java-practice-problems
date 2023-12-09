package kunalOOPs;

public class BasicStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	BasicStudent s1=new BasicStudent();
	
	System.out.println(s1.name);//normal printing
	System.out.println(s1.branch);//but printing can also be done by using toSring overriding
	System.out.println(s1.cgpa);
	s1.name="Chandana";
	s1.branch="CSE";
	s1.cgpa=9.89;
	System.out.println(s1.name);//normal printing
	System.out.println(s1.branch);//but printing can also be done by using toSring overriding
	System.out.println(s1.cgpa);
	}

}
