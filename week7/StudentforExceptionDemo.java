

public class StudentforExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			StudentforException s1=new StudentforException(120,"Shanti");
		}
		catch(InvalidIDException e1)
		{
			System.out.println(e1);	
		} catch (InvalidNameException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}

}
