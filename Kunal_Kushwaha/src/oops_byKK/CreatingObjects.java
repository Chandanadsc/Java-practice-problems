package oops_byKK;

public class CreatingObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student("chandana",23,89);
System.out.println(s1.name+" Default value");
System.out.println(s1.rno+" Default value");
System.out.println(s1.marks+" Default value");
Student s2=new Student(s1);
System.out.println(s1.name);
System.out.println(s1.rno);
System.out.println(s1.marks);
s2.name="saisree";
s2.rno=45;
s2.marks=45;
System.out.println("Student s2 "+s2.name);
System.out.println("Student s2 "+s2.rno);
System.out.println("Student s2 "+s2.marks);



s1.greeting();
s1.changeName();
s1.greeting();


Student s3=new Student();
System.out.println(s3.name);
for(int i=0;i<100000;i++)
{
	s3.new Student("Random name",45,998);
}

	}

}
 class Student {// constructor overloading: we have an empty constructor and a constructor which sets default values while instantiating
	 int rno;
	 String name;
	 float marks;
	 // using a constructor
	/*
	 * constructor:
	 * A constructor is a special function which is used to instantiate an object while creating it
	 */
Student(String name, int rno,float marks)
{
	this.name= name;
	this.rno=rno;
	this.marks=marks;
	// this: is used to generalize the way we can access every object whenever wanted
	// here the this is going to be replaced with the name of the object internally
}
Student (Student other){
	this.name=other.name;
	this.marks=other.marks;
	this.rno= other.rno;
}
// calling one constructor from another constructor
Student(){
	this("Thribhuvana",213,90);
}
//Student(){
//	// by default constructor
//	
//}


// No need to use new Keyword for Primitive data types because they are stored in the stack memory itself
void greeting()
{
	System.out.println("Hello my name is "+this.name);
}
void changeName()
{
	this.name="Class Hater";
}
/*
 * Final keyword for immutability only for primitive
 *  data types the values of the primitive data types 
 *  are fixed but whereas in the case of a objects of
 *   classes the values can be changed but the references cannot change or cannot reassign it  
 */

/*
 * Garbage collection : Functions are provided by java when the object is destroyed automatically
 * Finalize method is called while java is collecting the garbage: finalize()
 belongs to  Finalizer Class
 
 */
@Override
protected void finalize()throws Throwable{
	System.out.println("Object is destroyed");
}
}
