package week9;

public class StudentforTEST {
 int test1,test2,alm,ha,rollno;
 String name;
 
 
 public StudentforTEST(int rollno,String name,int test1,int test2,int alm,int ha) {
	 this.rollno=rollno;
	 this.test1=test1;
   this.test2=test2;
   this.alm=alm;
   this.name=name;
   this.ha=ha;
 }
 
 public String toString()
 {
	 return "Name: "+this.name+"\nRoll Number : "+this.rollno+"\nMarks in test1: "+this.test1+"\nMarks in test2"+this.test2+"\nalm:"+this.alm+"\nMarks in HA"+this.ha+"\n";
 }
}
