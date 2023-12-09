package practiceforExam;

public class Vote {
/*
 * .Create a user defined Exception which must be throw when the given age of the voter is less than the
 *  eligibility of voting*/
	int age;
	public Vote(int age)
	{
		this.age=age;
		
	}
	public void CheckAge() throws AgeException
	{
		if(this.age>18)
		{
			System.out.println("Enjoy");
		}
		else
		{
			throw new AgeException();
		}
	}
}
