package week6;

import java.util.Comparator;


class Sortbyname implements Comparator<Student1> {

	// Method
	// Sorting in ascending order of name
	public int compare(Student1 a, Student1 b)
	{

	 return a.name.compareTo(b.name);
	}
	}