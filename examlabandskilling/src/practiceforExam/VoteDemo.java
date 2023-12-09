package practiceforExam;

public class VoteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vote v1=new Vote(18);
try {
	v1.CheckAge();
} catch (AgeException e) {
	// TODO Auto-generated catch block
	System.out.println("Too bad");
}
	}

}
