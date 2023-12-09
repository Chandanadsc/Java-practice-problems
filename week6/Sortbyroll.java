package week6;

import java.util.Comparator;


class Sortbyroll implements Comparator<Student1> {

	// Method
	// Sorting in ascending order of roll number
	public int compare(Student1 a, Student1 b)
	{

	 return a.rollno - b.rollno;
	}
	}
