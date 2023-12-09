package oops_byKK;

class Test{
	static String name;
	public Test(String name) {
		Test.name =name;
	}
}
public class InnerClass2 {

	public static void main(String[] args) {
		Test a =new Test("Chandana");
		   Test b =new Test("Chandana2");
   System.out.println(a.name);
   System.out.println(b.name);
	}

}
