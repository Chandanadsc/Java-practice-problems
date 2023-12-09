package oops_byKK;
// outside classes cannot be static
public class InnerClasses {
static class Test{
	 String name;
	public Test(String name) {
	this.name =name;
	}
}
   public static void main(String[] args) {
	   Test a =new Test("Chandana");
	   Test b =new Test("Chandana2");
	   
	   System.out.println(a.name);
	   System.out.println(b.name);
   }

}
// static methods and stuff - compile time