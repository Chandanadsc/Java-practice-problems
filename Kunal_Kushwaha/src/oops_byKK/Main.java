package oops_byKK;

public class Main {

	public static void main(String[] args) {
	//	Singleton s1 =new Singleton();not possible
		Singleton s1 = Singleton.getInstance();
		
		Singleton s2 = Singleton.getInstance();
		
		Singleton s3 = Singleton.getInstance();
		
	}

}
