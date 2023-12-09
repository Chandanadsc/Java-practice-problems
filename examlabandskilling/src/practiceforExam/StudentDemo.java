package practiceforExam;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1= new Student ();
try
{
	s1.setID("22100301");
	System.out.println("Enter next");
}
catch(InvalidId e)
{
	e.toString();
}
try {
	s1.setName("Chandana");
	
}
catch(InvalidNameException e1)
{
	e1.toString();
}
s1.setBranch("CSE");
s1.setGender("F");
System.out.println(s1);

}
}