package co1;




public class Student implements Comparable<Student>{
    private String id; 
    private String name;
    private int marks;

    public Student(String id, String name, int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

   

    @Override
    public int compareTo(Student other){
        return this.marks - other.marks;  
    }
    
    public String toString()
	{
	  return "id is "+this.id+" name is "+this.name+ " Marks= "+this.marks;	
	}
 }
