package week6;


class Student1 {

	// Attributes of a student
	int rollno;
	String name, address;

	// Constructor
	public Student1(int rollno, String name, String address)
	{

	 // This keyword refers to current instance itself
	 this.rollno = rollno;
	 this.name = name;
	 this.address = address;
	}

	// Method of Student class
	// To print student details in main()
	public String toString()
	{

	 // Returning attributes of Student
	 return this.rollno + " " + this.name + " "
	   + this.address;
	}
	}