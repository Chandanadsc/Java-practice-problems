package week4;

public class OUTER {
/*
 * You have been given a task to develop a program which has outer class OUTER and Inner private class 
INNER which is used to display your name. Outer class contains a method which is used to verify the 
PASSWORD entered by the user and if the entered PASSWORD is correct, then call the inner class method 
to display your name. Write a Demo class and make necessary calls to access OUTER and INNER classes. 
 */
	private String Correct="chandana";
	void password(String Password)
	{
		if(Correct.equals(Password))
		{
			INNER n=new INNER();
			System.out.println(n);
		}
		else 
		{
			System.out.println("Wrong password \n try again");
		}
	}
}
