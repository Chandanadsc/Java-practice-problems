package week8;

public class Student {
private String name;
private int rollno;
private double cgpa;
public Student(String name,int rollno,double cgpa)
{
	this.setName(name);
	this.setCgpa(cgpa);
	this.setRollno(rollno);
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public double getCgpa() {
	return cgpa;
}
public void setCgpa(double cgpa) {
	this.cgpa = cgpa;
}

}
